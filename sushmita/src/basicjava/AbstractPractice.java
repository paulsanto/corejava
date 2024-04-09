package basicjava;

abstract class Parent{
	
	Parent(){
		System.out.println("Mai parent class ki constructor hu!");
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}
	
	public abstract void greet();
}

class Child extends Parent{
	
	@Override
	 public void greet() {
		System.out.println("Good Morning!");
	}
	
	public void display() {
		System.out.println("I am a child of Parent class!");
	}
}

abstract class Child2 extends Parent{
	
	public void th() {
		System.out.println("I am good!");
	}
}

public class AbstractPractice {

	public static void main(String[] args) {
		
		//Parent pr = new Parent();
		Child ch = new Child();
		//Child2 ch2 - new Child2();
		
		ch.sayHello();
		ch.display();

	}

}
