package hybrid;

public class Shirts extends Clothing{
	
	
	void Model(String Modelname) {
		System.out.println("Model name is: " + Modelname);
	}
	
	void Category() {
		System.out.println("Shirts uder the category of Clothing");
	}

	public static void main(String[]args) {
		Shirts obj = new Shirts();
		obj.display_product_details("Peter England", 5000);
		obj.Category();
		obj.Model("Allen solly");
	}
}
