package oopsconcept;

class Student1{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	//Non parameterized constructor
	//Student1(){
	//	System.out.println("Constructor called");
	//}
	
	//Parameterized constructor
	/**Student1(String names, int ages){
		this.name = names;
		this.age= ages;
	}**/
	
	//Copy constructor
	Student1(Student1 s2){
		this.name = s2.name;
		this.age = s2.age;
	}
	
	Student1(){
		
	}
}


public class ContructorConcept {
	public static void main(String args[]) {
		
		Student1 s1= new Student1();
		s1.name = "Sushmita";
		s1.age = 34;
		
		Student1 s2 = new Student1(s1);
		s2.printInfo();
		
	}

}
