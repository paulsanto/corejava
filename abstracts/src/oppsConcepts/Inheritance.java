package oppsConcepts;

class Shape{
	void area() {
		
	}
	void perimeter() {
		
	}
}

class Circle extends Shape{
	
	int radius;
	
	Circle(int r){
		this.radius = r;
	}
	
	@Override
	void area() {
		System.out.println("Area of the circle is: "+(3.14*radius*radius));
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter of the circle is: "+(2*3.14*radius));
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	@Override
	void area() {
		System.out.println("Area of the rectangle is: "+(length*width));
	}
	
	@Override
	void perimeter() {
		System.out.println("Ara of the perimeter is: "+(2*(length+width)));
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		Circle c = new Circle(3);
		c.area();
		c.perimeter();
				
		System.out.println();
		
		Rectangle r = new Rectangle(14,11);
		r.area();
		r.perimeter();

	}

}
