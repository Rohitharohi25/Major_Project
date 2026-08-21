package hybrid;

public class Products {
	
	void display_product_details(String pname,double price) {
		System.out.println(pname + " is having " + price);
	}
	
	public static void main(String[]args) {
		Products obj = new Products();
		obj.display_product_details("Galaxy",450000);
	}
}
