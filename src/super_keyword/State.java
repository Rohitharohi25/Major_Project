package super_keyword;

public class State extends Country{
	
	void display() {
		System.out.println(super.population); //this super.population we have to call inside the method -> random display method
	}
	double population = 60000000;
	public static void main(String[]args) {
		State obj = new State();     
        obj.display();
	}
}
