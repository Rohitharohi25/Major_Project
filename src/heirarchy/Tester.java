package heirarchy;

public class Tester extends Emp {

	
	void Evaluate() {
	 System.out.println(name + " is Evaluating the code");
	}
	void Findbugs() {
		 System.out.println(name + " is Evaluating the code");
		}
	
	public static void main(String[]args) {
		Tester obj = new Tester();
		obj.id = 21;
		obj.name = "sid";
		obj.salary=950000;
		
		obj.login();
		obj.Evaluate();
		obj.Findbugs();
		obj.payslip();
		obj.logout();
	 // obj.WriteCode();    it does not work bcoz it is heirarchy that means Tester extends Emp not dev writecode is in dev  ..(emp) a<- extends b(dev)  (tester) c<- extends a 
	}
}

