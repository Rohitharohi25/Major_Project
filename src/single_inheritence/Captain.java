package single_inheritence;

public class Captain extends Team_11{
	
	void Teamlead() {
		System.out.println( name  + " is a teamlead ");
	}
	
	void TeamA() {
		System.out.println( name + " is bowling ");
	}
	
	public static void main(String[]args) {
		Captain obj = new Captain() ;
		obj.jerseyNo = 7;
		obj.name = "Thala";
		obj.Team();
		obj.play();
		obj.Teamlead();
		obj.TeamA();
	}

}
