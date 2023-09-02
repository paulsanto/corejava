package oppsConcepts;

class Person{
	private String name;
	private int age;
	private String email;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name= name;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public void setEmail(String email) {
		this.email= email;
	}
}

public class EncapsulationGettersSetters {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		//Using setter method to set the person's information
		person1.setName("Sushmita");
		person1.setAge(35);
		person1.setEmail("psushmita24@yahoo.in");
		
		//Use getter method to retrieve and print the person's informations
		System.out.println("Name: "+ person1.getName());
		System.out.println("Age: "+ person1.getAge());
		System.out.println("Email: "+person1.getEmail());

	}

}
