import java.util.*;

public class nestedloops {
	public static void main(String args[]) {
		
		// nested loops = a loop inside of a loop
		
	//	Scanner scanner = new Scanner(System.in);
	//	int rows;
	//	int columns;
	//	String symbol = "";
		
	//	System.out.println("Enter number of rows: ");
	//	rows = scanner.nextInt();
	//	System.out.println("Enter number of columns: ");
	//	columns = scanner.nextInt();
	//	System.out.println("Enter symbol to use: ");
	//	symbol = scanner.next();
		
	//	for (int i=1; i<=rows; i++) {
	//		System.out.println();
	//		for (int j=1; j<=columns; j++) {
	//			System.out.print(symbol);
	//		}
	//	}
		
		System.out.println("-----------------------------");
		int n =5;
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		

		for(int i=1; i<=n; i++) {
			//spacess
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
		for(int i=1; i<=n; i++) {
		//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			for(int j=2; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1;i--) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5;j++) {
				if(i==1 || j==1 ||i==n || j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		System.out.println("------------------------------");
		for(int i=1; i<=n; i++) {
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j= 1; j<=5; j++) {
			if (i==1|| j==1|| i== n|| j== n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for (int i=1; i<=n; i++) {
			//spaces
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//1st part number
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//2nd part
			for(int j=2; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
