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
		for(int j=0; j<5; j++) {
			System.out.println(2*j);
		}
		
		// print first n natural numbers in reverse way
		System.out.println();
		int p = 5;
		for(int l=p; l!=0; l--) {
			System.out.println(l);
		}

	}

}
