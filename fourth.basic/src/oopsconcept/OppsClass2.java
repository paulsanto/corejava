package oopsconcept;

class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println("The name of the student is:"+ this.name);
		System.out.println("The age of the student is:" + this.age);
	}
}


public class OppsClass2 {
	public static void main(String agrs[]) {
		Student s1 = new Student();
		s1.name = "Sushmita";
		s1.age = 35;
		
		s1.printInfo();
	}

}
