package basicjava;

class Circle1{
	public int redius;
	
	Circle1(){
		System.out.println("I am non paramitarized constructor!");
	}
	
	Circle1(int r){
		System.out.println("I am a constructor of Circle!");
		this.redius = r;
	}
	
	public double area() {
		return Math.PI*this.redius*this.redius;
	}
}

class Cylinder1 extends Circle1{
	public int height;
	
	Cylinder1(int r, int h){
		super(r);
		System.out.println("I am a constructor of Cylinder!");
		this.height = h;
	}
	
	public double volume() {
		return Math.PI*this.redius*this.redius*this.height;
	}
}
public class InheritancePractice {

	public static void main(String[] args) {
		//Circle1 cr = new Circle1(5);
		
		Cylinder1 cl = new Cylinder1(5, 12);
		System.out.println(cl.volume());
		

	}

}
