
public class ifstatement {
	public static void main(String args[]) {
		
		//if statement = performs a block of code if it's condition evaluates to be true
		
		int age = 14;
		
		if(age >=75 ) {
			System.out.println("ok Boomer!");
		}
		else if(age >= 18) {
			System.out.println("You are an adult!");
		}
		else if(age <18) {
			System.out.println("Your are teenager!");
		}
		else {
			System.out.println("You are not an adult!");
		}
	}

}
