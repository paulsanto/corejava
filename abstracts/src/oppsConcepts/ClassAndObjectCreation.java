package oppsConcepts;

public class ClassAndObjectCreation {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.make = "Hyundai";
		car1.model = "Verna";
		car1.year = 2000;
		
		car1.start();
		car1.printInfo();
		
		System.out.println();
		
		Car car2 = new Car();
		car2.make = "Toyota";
		car2.model = "Corolla";
		car2.year = 2012;
		
		car2.printInfo();
		car2.start();
		car2.stop();
		

	}

}

class Car{
	
	String make;
	String model;
	int year;
	
	void start() {
		
		System.out.println("The car start");
	}
	
	void stop() {
		System.out.println("The car stopped");
	}
	
	void printInfo() {
		System.out.println("The car maker is: "+ this.make);
		System.out.println("The car model is: "+ this.model);
	}
	
}