package array;
import java.util.*;

public class Array2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int numbers[] = new int [size];
		
	//	for(int i=0; i<size; i++) {
	//		number[i]= sc.nextInt();
	//	}
		
	//	int x = sc.nextInt();
		
		
		//print the number is array
	//	for(int i=0; i<number.length; i++) {
			//System.out.print(number[i]+" ");
	//		if (number[i] == x) {
	//			System.out.println("x found at index: "+i);
	//		}
		
	//	int size = sc.nextInt();
		
	//	String names[] = new String [size];
		
		//input
	//	for (int i=0; i<size; i++) {
			
	//		names[i]= sc.next();
	//	}
		
		//output
	//	for(int i=0; i<names.length; i++) {
	//		System.out.println("name " + (i) + " is: "+ names[i]);
		
		
	//	}
		
		for(int i=0; i<size; i++) {
			
			numbers[i]= sc.nextInt();
			
		}
		int min= numbers[0];
	    int max= numbers[0];
		
		
		for(int i=0; i<numbers.length; i++ ) {
			
			if(numbers[i]<min) {
				
				min = numbers[i];
				
			}
			
			if(numbers[i]>max) {
				
				max = numbers[i];
			}
			
			
		}
		
		System.out.println("Smallest number is: "+min);
		System.out.println("Greatest number is: "+max); 
	}

}
