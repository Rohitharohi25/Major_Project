package ex_mutilevel;

public class Mobile extends Electronics{
	
	void model(String Modelname) {
		System.out.println("Modelname is: " + Modelname);
	}
	
	
	public static void main(String[]args) {
		Mobile obj = new Mobile();
		obj.display_product_details("Galaxy ",450000);
		obj.Category();
		obj.model("Samsung F18");
	}

}
