package Com.ver1;

public class Dev extends Emp{
	
	
	void WriteCode(){
		
		System.out.println(name + " is writing code ");
	}
	
	void fixbugs() {
		System.out.println(name + " is fixing bugs ");
	}

	public static void main(String[]args) {
		Dev obj = new Dev();
		obj.name = "Rohi"; //Inherited property
		obj.id = 18;  //Inherited property
		obj.salary = 95000; //Inherited property
		obj.payslip();   //	Inherited method
		obj.login(); //Inherited Method
		obj.WriteCode();  //own method
		obj.fixbugs();    //own method
		obj.logout();  //Inherited method
		
		
	}
	
}
