package basic;

import java.util.Scanner;

public class ReadandPring {
	//The given task is to taken an integer as input from the user
	// and print that integer in Java language
	
	public static void main(String[] agr) {
		// Declare the variables
		int num;

		// Input the integer
		System.out.println("Enter the integer");

		// Create scanner object
		Scanner s = new Scanner(System.in);

		// Read the next integer from the screen
		num = s.nextInt();

		// Display the integer
		System.out.println("Entered integer is: " + num);
	
		System.out.println("--------------------------------------");
		
		//Input the character
		System.out.println("Enter the letter: ");
		
		//Read the next character from the scanner
		char A = s.next().charAt(0);
		
		//Display the character
		System.out.println("A = "+A);

		System.out.println("--------------------------------------");
		
		//Declare the variable
		String name;
		
		//Input the string
		System.out.println("Enter the Name: ");
		
		//Read the next string from the scanner
		 name = s.next();
		
		//Display the name
		System.out.println("Entered Name is: "+name);
		
		System.out.println("---------------------------------------");
		
		//Input the string
		System.out.println("Enter the sectence: ");
		
		//Read the next string from the scanner
		String sen = s.nextLine();
		
		//convert string to character
		char c = sen.charAt(0);
		
		//Display the character 
		System.out.println("The first character of the sentence is: "+c);
		
		
		
		
	}
}
