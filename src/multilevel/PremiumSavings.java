package multilevel;

public class PremiumSavings extends Savings{

	void perks(){
		System.out.println("Perks has been added");
	}
	
	public static void main(String[]args) {
		PremiumSavings obj = new PremiumSavings();
		obj.Accholdername = "Kv";
		obj.Balence = 580000;
		
		obj.deposit();
		obj.withdraw(40000);
		obj.checkbalence();
		
		obj.intrest();
		obj.perks();
	}
}
