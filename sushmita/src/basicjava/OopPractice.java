package basicjava;

class Cylinder{
	private int height;
	private int redius;
	
	public Cylinder(int r, int h) {
		this.redius = r;
		this.height = h;
	}
	public int getRedius() {
		return redius;
	}
	public void setRedius(int r) {
		this.redius = r;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		this.height = h;
	}
	
	public double volume() {
		return 3.14* redius* redius * height;
	}
	
	public double area() {
	return 2* 3.14* redius* redius + 2* 3.14* redius * height;
	}
}

class Rectangle{
	private int breadth;
	private int height;
	
	public Rectangle() {
		this.breadth = 4;
		this.height = 5;
	}
	
	public Rectangle(int b, int h) {
		this.breadth = b;
		this.height = h;
	}
	
	public int getBreadth() {
		return breadth;
	}
	public int getHeight() {
		return height;
	}
}

public class OopPractice {

	public static void main(String[] args) {
		Cylinder cl = new Cylinder(9 , 12);
		
		//cl.setHeight(12);
		//cl.setRedius(9);
		System.out.println(cl.getHeight());
		System.out.println(cl.getRedius());
		System.out.println(cl.area());
		System.out.println(cl.volume());
		
		Rectangle ra = new Rectangle(45 , 54);
		System.out.println(ra.getBreadth());
		System.out.println(ra.getHeight());

	}

}
