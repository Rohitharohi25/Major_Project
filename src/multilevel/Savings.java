package multilevel;

public class Savings extends Accounts{

	void intrest(){
		System.out.println("Intrest rate is : " + Balence*5/100);
	}
	
	public static void main(String[]args) {
		Savings obj = new Savings();
	//	obj.perks(); //Invalid coz it does not extends premiumsavings class
		obj.deposit(); //valid coz it extrends acc class
	}
	
}
