package basicjava;

public class RecursionPractice {
	
	static int fibonacci(int x) {
		// formula (n-1)+(n-2)
		
		/*if(x == 0) {
			return 0;
		}else if(x == 1) {
			return 1;
		}*/
		if(x==1 || x==2) {
			return x-1;
		}
		else {
			return fibonacci(x-1)+fibonacci(x-2);
		}
	}
	
	static int factorial(int l) {
		// factorial(0) = 1
		// factorial(n) = n*(n*1)*(n-2)....1
		// factorial(n) = n * factorial(n-1)
		
		if(l==0 || l==1) {
			return 1;
		}else {
			return l * factorial(l-1);
		}
	}
	static int factorial_iterated(int l) {
		// factorial(0) = 1
		// factorial(n) = n*(n-1)*(n-2)....1
		// factorial(n) = n * factorial(n-1)
		
		if(l==0 || l==1) {
			return 1;
		}else {
			int product = 1;
			for(int i=1; i<=l; i++) {
				product *= i;
			}
			return product;
			
		}
	}
	
	static int sumRec(int n) {
		// base condition
		if(n==1) {
			return 1;
		}
		
		return n + sumRec(n-1);
	}
	
	static void pattern1(int n) {
		if(n>0) {
			pattern1(n-1);
			
			for (int i=0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		//Write a function to print nth term of fibonacci series using recursion
		// fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		int result = fibonacci(7);
		System.out.println(result);
		
		System.out.println();
		/*int factornum = 5;
		System.out.println("The value of factornum is: "+factorial(factornum));
		System.out.println("The value of factornum is: "+factorial_iterated(factornum));
        */
		
		// Print the sum of first n natural number
		
		int c = sumRec(7);
		System.out.println(c);
		
		 pattern1(4);
		
	}

}
