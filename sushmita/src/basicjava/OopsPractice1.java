package basicjava;

class Rectangle1{
	int width;
	int height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int w) {
		this.width = w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int area() {
		return width*height;
	}
	
	public int perimeter() {
		return 2*(width + height);
	}
}

public class OopsPractice1 {

	public static void main(String[] args) {
		
		Rectangle1 r = new Rectangle1();
		r.setHeight(6);
		r.setWidth(9);
		
		System.out.println("Area of the rectangle is: "+r.area());
		System.out.println("Perimeter of the rectangle is: "+r.perimeter());
		

	}

}
