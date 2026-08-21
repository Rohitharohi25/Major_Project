package super_keyword;

public class Truck extends Vehicle {

	
	void accelerate() {
		super.accelerate();
		System.out.println("Truck is being accelerated");
	}
	
	public static void main(String[]args) {
		Truck obj = new Truck();
		obj.accelerate();
		
	}
}
