package c_loop;
import java.util.*;

public class ForLooops {
	public static void main(String args[]) {
		 // for loop = executes a block of code a listed amount of times
		
		for(int i = 10; i>=0; i--) {
			System.out.println(i);
		}
		System.out.println("Happy New Year!");
		System.out.println("------------------------------");
		
		int m;
		
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the value of m: ");
	 m = scanner.nextInt();
	 
	 for(int i=1; i<=10; i++) {
		 System.out.println(m+" * "+i+" = "+ m*i);
	 }
	 System.out.println("---------------------------------------");
	 
	 
		int n = 5;
		
		// upper half
		for (int i=1; i<=n; i++) {
			// 1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			int spaces= 2*(n-i);
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			//2nd part
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//lower half
		for (int i=n; i>=1; i--) {
			//1st part
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			int spaces= 2*(n-i);
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			//2nd part
			for (int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
		//upper half
		for(int i=1; i<=n; i++) {
			//spaces
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//lower half
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} 

}
