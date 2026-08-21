package method_overriding;

public class Patients extends Hospital{

	String Pname;
	void ICU(int roomno) {
		System.out.println(Pname + "has been admitted in " + roomno);
	}
	public static void main(String[]args) {
		Patients obj = new Patients();
		obj.ICU(8);
		obj.Pname = "rohi";
		
	}
}
