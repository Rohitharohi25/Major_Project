package method_overriding;

public class Doctors extends Hospital{

	String Dname;
	void ICU(int roomno) {
		System.out.println(Dname + "has been consulting ICU" + roomno);
	}
	public static void main(String[]args) {
		Doctors obj = new Doctors();
        obj.ICU(7);
        obj.Dname = "Dr.sid";
	}
}
