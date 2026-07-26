#!/usr/bin/env python3
import json
import os
from web3 import Web3, HTTPProvider

# Connect to Ganache
ganache_url = 'http://127.0.0.1:8545'
web3 = Web3(HTTPProvider(ganache_url))

if not web3.isConnected():
    print(f"ERROR: Could not connect to Ganache at {ganache_url}")
    exit(1)

print("✓ Connected to Ganache at", ganache_url)

# Load contract ABI and bytecode
contract_json_path = 'build/contracts/SupplyChain.json'
with open(contract_json_path, 'r') as f:
    contract_data = json.load(f)

abi = contract_data['abi']
bytecode = contract_data['bytecode']

print("✓ Loaded contract ABI and bytecode")

# Get the first account from Ganache (accounts[0])
accounts = web3.eth.accounts
account = accounts[0]

print(f"✓ Using account: {account}")
print(f"  Balance: {web3.eth.get_balance(account) / 1e18} ETH")

# Create contract object
SupplyChain = web3.eth.contract(abi=abi, bytecode=bytecode)

# Deploy the contract
print("\n📦 Deploying contract...")
tx_hash = SupplyChain.constructor().transact({'from': account, 'gas': 3000000})

print(f"  Transaction hash: {tx_hash.hex()}")

# Wait for receipt
receipt = web3.eth.wait_for_transaction_receipt(tx_hash)

contract_address = receipt['contractAddress']

print("\n✅ Contract deployed successfully!")
print(f"   Contract Address: {contract_address}")

# Verify contract is accessible
contract = web3.eth.contract(address=contract_address, abi=abi)
product_count = contract.functions.getProductCount().call()
user_count = contract.functions.getUserCount().call()

print(f"\n✓ Contract verified!")
print(f"  Product Count: {product_count}")
print(f"  User Count: {user_count}")

# Output the address for use in views.py
print(f"\n📝 Update views.py line 45 with:")
print(f'   contract_address = \'{contract_address}\'')
