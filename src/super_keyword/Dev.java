package super_keyword;

public class Dev extends Emp {

  public Dev() {
	super(15); //calls the parent class const (parent is Emp so it calls const of emp )  we do not call const as super. we call it with creating obj.
	System.out.println("Developer const");
	
}	
  public static void main(String[]args) {
		Dev obj = new Dev();
	}
}
