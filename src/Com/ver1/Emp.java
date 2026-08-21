package Com.ver1;

public class Emp {

	String name;
	int id;
	double salary;
	
	void login(){
		System.out.println(name + " has logged in");
	}
	
	void logout() {
		System.out.println(name + " has logged out");
	}
	
	void payslip( ) {
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		System.out.println("salary : " + salary);
	}
	
}

//class Dev extends Emp{
//	public static void main(String[]args) {
//		
//	}
//}
