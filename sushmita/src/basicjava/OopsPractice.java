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
		

	}

}
