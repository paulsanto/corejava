package basicjava;

import java.util.Scanner;

class MaxRetrieveException extends Exception{
	
	MaxRetrieveException(String message){
		super(message);
	}
	/*public String toString() {
		return "Maximum number of try";
	}
	
	public String getMessage() {
		return "Maximum number of try";
	}*/
}

public class ExceptionPractice {

	public static void main(String[] args) {
		// Write a java program that print "HaHa" during Arithmetic exception and print " HeHe" during Illegal argument exception.
		
		/*try {
			int a = 66/0;
		}
		catch(ArithmeticException e) {
			System.out.println("HaHa");
		}
		catch(IllegalArgumentException e) {
			System.out.println("HeHe");
		}
		*/
		
		// Write a Java program that allows you to keep accessing an array until a valid index is given. If max retrieve exceed 5 print "Error"
		
		boolean flag = true;
		int[] marks = new int[3];
		marks[0] = 7;
		marks[1] = 56;
		marks[2] = 6;
		
		Scanner sc = new Scanner(System.in);
		int index;
		int i = 0;
		
		while(flag && i<5) {
			
			try {
				System.out.println("Enter the value of index");
			index = sc.nextInt();
			System.out.println("The value of marks[index] is "+marks[index]);
			break;
			
			}
			catch(Exception e) {
				System.out.println("Invalid Index");
				i++;
			}
			if(i>=5) {
				try {
					throw new MaxRetrieveException("Maximum number of tries exceeded");
				}
				catch(MaxRetrieveException e) {
				System.out.println(e.getMessage());
				}
				
			}
		}

	}

}
