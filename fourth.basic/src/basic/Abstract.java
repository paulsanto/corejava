package basic;

public class Abstract extends AbstractDemo{
	public static void main(String atgs[]) {
		AbstractDemo demo = new Abstract();
		demo.display();
	}

}
abstract class AbstractDemo{//Abstract class
	private int i=0;
	public void display() {//non-abstract method
		System.out.println("Welcome to Tutorials Point");
	}
}
