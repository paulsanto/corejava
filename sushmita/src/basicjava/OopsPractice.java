package basicjava;

class Employee{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
}

class CellPhone{
	
	
	public void call(){
		System.out.println("Calling.....");
	}
	
	public void ring() {
		System.out.println("Ringing....");
	}
	
	public void vibrate() {
		System.out.println("Vibrating....");
	}
}

class Square{
	int side;
	
	public int  area() {
		return side*side;
	}
	
	public int perimeter() {
		return 4*side;
	}
}

class Circle{
	private int redius;
	
	public int getRedius() {
		return redius;
	}
	
	public void setRedius(int r) {
		redius = r;
	}
	
	public double getArea() {
		return Math.PI* redius* redius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*redius;
	}
}

public class OopsPractice {

	public static void main(String[] args) {
		Employee person1 = new Employee();
		
		person1.salary = 15000;
		person1.setName("Harry is a trainer!");
		System.out.println(person1.getName());
		System.out.println(person1.getSalary());
		
		CellPhone phone = new CellPhone();
		
		phone.call();
		phone.ring();
		phone.vibrate();
		
		Square sc = new Square();
		sc.side = 5;
		
		System.out.println(sc.area());
		System.out.println(sc.perimeter());
		
		Circle cr = new Circle();
		
		cr.setRedius(5);
		
		System.out.println(cr.getRedius());
		System.out.println(cr.getArea());
		System.out.println(cr.getPerimeter());
		
		// manual checking Area
		double manualCheckingArea = Math.PI*cr.getRedius()*cr.getRedius();
		System.out.println("The area of manual checking is "+manualCheckingArea);
		
		// manual checking perimeter
		double manualCheckingPerimeter = Math.PI*2*cr.getRedius();
		System.out.println("The perimeter of manual checking is "+manualCheckingPerimeter);
		
		if(manualCheckingArea == cr.getArea()) {
			System.out.println("The area is correct");
		}else {
			System.out.println("The area is not correct");
		}
		
		if(manualCheckingPerimeter == cr.getPerimeter()) {
			System.out.println("The perimeter is correct!");
		}else {
			System.out.println("The perimeter is not correct!");
		}

	}

}
