package finalkeyword;

public class Wardvoter extends Voter{
	int wardno;
	void display() {
	
		System.out.println(wardno);
	}

	public static void main(String[] args) {
		Wardvoter wv=new Wardvoter();
		wv.display();

	}
}