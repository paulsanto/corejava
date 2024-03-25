package basicjava;
import java.util.Scanner;

public class MethodPractice {
	
	static int smallestnum(int x, int y, int z) {
		
		//return Math.min(Math.min(x, y), z);
		
		int smallnum = x;
		if(y< smallnum) {
			smallnum = y;
		}
		if(z<smallnum) {
			smallnum = z;
		}
		return smallnum;
	}
	
	static float averagenum(float num1, float num2, float num3) {
		return (num1+num2+num3)/3;
	}
	
	static void multiplication(int n) {
		
		for(int i = 1; i<=10; i++) {
			System.out.format("%d x %d = %d\n",n, i, n*i);
		}
	}
	
	static void pattern(int p) {
		for(int i =0; i<p; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
	}
	
	static void temparature(float c) {
		if(c==0) {
			System.out.println("32 Fahrenheit");
		}else {
			float f = (9/5 * c)+32;
			System.out.println(f+"Fahrenheit");
		}
	}

	public static void main(String[] args) {
		// Write a Java method to find the smallest number among three numbers.
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter the first number: ");
		int firstnum = sc.nextInt();
		System.out.println("Enter the second number: ");
		int secondnum = sc.nextInt();
		System.out.println("Enter the third number: ");
		int thirdnum = sc.nextInt();
		
		System.out.println("The smallest number is: "+smallestnum(firstnum, secondnum, thirdnum));
		*/
		
		// Write a Java method to compute the average of three numbers.
		
		/*System.out.println("Enter the first number: ");
		float firstnum = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float secondnum = sc.nextFloat();
		System.out.println("Enter the third number: ");
		float thirdnum = sc.nextFloat();
		
		System.out.println("The average of the number is: "+ averagenum(firstnum, secondnum, thirdnum));
		*/
		
		// Write a Java program to print multiplication table of a number n
		
		
		//multiplication(7);
		
		// Write a program using functions to print the following pattern
		 //  *
		 //  **
		 //  ***
		  // ****
		
		//pattern(4);
		
		temparature(3);

	}

}
