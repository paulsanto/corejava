package basicjava;

public class ForLoop {

	public static void main(String[] args) {
		// print first n odd numbers
		
		System.out.println("First 5 odd numbers are: ");
		int n = 5;
		
		for(int i=0; i<n; i++) {
			System.out.println(2*i+1);
		}
		
		// print first n even numbers
		System.out.println("First 5 even numbers are: ");
		int m = 5;
		for(int j=0; j<m; j++) {
			System.out.println(2*j);
		}
		
		// print first n natural numbers in reverse way
		System.out.println();
		int p = 5;
		for(int l=p; l!=0; l--) {
			System.out.println(l);
		}
		
		// Pattern 
		
		for(int i=4; i>0; i--) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Write a program to sum first n even numbers using while loop
		
		int sum = 0;
		int i = 1;
		while(i<=3) {
			sum = sum + (2*i);
			System.out.println(sum);
			i++;
		}
		
		// write a program to print multiplication table of a given number n
		
		int k = 5;
		int sum1 = 0;
		for(int a=1; a<=10; a++) {
			System.out.printf("%d X %d = %d", k, a , k*a);
			System.out.println();
			sum1 = sum1+(k*a);
			
		}
		System.out.println(sum1);
		// Write a program to find factorial of a given number using for loop
		
		int f = 5;
		int factorial = 1;
		for(int h=f; h>0; h--) {
			factorial *= h;
			System.out.println(factorial);
		}

	}

}
