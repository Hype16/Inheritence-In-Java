
public class Parent {
	private int tax;
	int init_price=30;
	Parent (int x){
		this.init_price = x;
	}
	void price() {
		System.out.println("Calling Parent's Method");
		tax = (init_price/10)+40;
		System.out.println("Actual Price including Tax is:-"+(tax+init_price));
		
	}
	void display() {
		System.out.println("Message of parent class ");
	
		
	}
}
