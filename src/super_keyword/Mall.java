package super_keyword;

public class Mall {

   public Mall(int Entry_Ticket) {
	   this("rt",67);
	System.out.println("Mall const");
	System.out.println("Ticket cost" + Entry_Ticket);
}	
   
   public Mall(String shopping, int price) {
	   System.out.println("Shopping const");   
  }
   
   public Mall() {
	   this(20);
	   System.out.println("default const");
}
}
