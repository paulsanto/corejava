package oppsConcepts;

interface Drawable{
	void draw();
}

class Circles implements Drawable{

	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
		
	}
	
}
class Rectangles implements Drawable{
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
class Triangle implements Drawable{
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
}
public class ArrayPolymorphism {

	public static void main(String[] args) {
		Drawable[] shapes = new Drawable[3];
		
		shapes[0] = new Circles();
		shapes[1] = new Rectangles();
		shapes[2] = new Triangle();
		
		//INvoking their draw method on each object in the array
		/**for(Drawable shape: shapes) {
			shape.draw();
		}**/
		for(int i=0; i<shapes.length; i++) {
			shapes[i].draw();
		}
	}

}
