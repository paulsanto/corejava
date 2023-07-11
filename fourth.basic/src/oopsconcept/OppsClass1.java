package oopsconcept;

class Pen{
	String color;
	String type; // ball pen, gel pen
	
	public void write() {
		System.out.println("writing something");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

public class OppsClass1 {
	public static void main(String args[]) {
		Pen pen1 = new Pen();
		pen1.color ="Blue";
		pen1.type ="Gel";
		
		pen1.write();
		
		Pen pen2 = new Pen();
		pen2.color = "Black";
		pen2.type = "Bellpoint";
		
		pen1.printColor();
		pen2.printColor();
		
		
	}

}
