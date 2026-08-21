package method_overriding;

public class EqualsMethod {

	public static void main(String[]args) {
		String st = new String("Jayasri");
		String st2 = new String("Jayasri");
	
		
		System.out.println(st==st2);  // compares the reference
		System.out.println(st.equals(st2));
	}
}

