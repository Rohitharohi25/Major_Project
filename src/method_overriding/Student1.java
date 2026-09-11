package method_overriding;

public class Student1{

	int id;
	String name;
	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 - id=" + id + ", name=" + name + "";
	}
	
}
  class Main{
	public static void main(String[]args) {
		Student1 obj = new Student1(18,"SD");
		Student1 obj1 = new Student1(17,"ABD");
		System.out.println(obj);
		System.out.println(obj1);
	}
}
