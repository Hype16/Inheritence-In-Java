import java.util.Scanner;
public class child extends Parent {
	
	private int a =10;
	
	child(int x,int y) {
		super(x);
		this.a = y;
	}
	static int x;
	public void method1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price:-");
		x = sc.nextInt();
		Parent p1 = new Parent(x);
		p1.price();
		sc.close();
	}
	void method2() {
		Parent p1 = new Parent(10);
		System.out.println("inside child method 2");
		p1.display();
		System.out.println("Parent Variable by Super Keyword"+super.init_price);
		System.out.println("Invoking the child class constructor and showing Private val"+a);
	}
}