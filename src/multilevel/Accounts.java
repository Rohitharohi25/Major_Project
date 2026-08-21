package multilevel;

public class Accounts {
	
	String Accholdername;
	double Balence;
	void deposit() {
		System.out.println(Balence + " Ha been deposited ");
		}
	
	void withdraw(double amount) {
		System.out.println(amount + " Has been successfullly withdrawl");
		Balence = Balence-amount;
		System.out.println("Balence after withdrawl is " + Balence);
	}

	void checkbalence() {
		System.out.println(Accholdername + " account consists of " + Balence);
	}
	
	public static void main(String[]args) {
 
	}
}
