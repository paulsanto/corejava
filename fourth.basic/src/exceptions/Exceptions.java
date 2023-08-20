package exceptions;

import java.util.*;


public class Exceptions {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while(true) {
			try {
			System.out.println("Input a number: ");
			float input = reader.nextFloat();
			System.out.println("You input the number: "+ input);
			System.out.println("\r\n");
		}
			catch(InputMismatchException e) {
				System.out.println("Please enter a float number.");
				e.printStackTrace(System.out);
				System.out.println("\r\n");
				
				
				//Clear the input buffer to avoid infinite loop
				reader.nextLine();
			}
		}

	}

}
