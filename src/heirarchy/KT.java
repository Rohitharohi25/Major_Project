package heirarchy;

public class KT extends Emp {

	void Trainer() {
		System.out.println( name + " is training employees");
	}
	
	public static void main(String[]args) {
		KT obj =new KT();
		obj.id = 8;
		obj.name = "KV";
		obj.salary = 1500000;
		
		obj.login();
		obj.payslip();
		obj.Trainer();
		obj.logout();
	}
}
