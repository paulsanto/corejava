package hackerrankac;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArraysList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
	  //Create an empty list to store integer
		List<Integer> ar = new ArrayList<>();
		
		//Read the integer from the user and add them to the list
		for(int i = 0; i < size; i++) {
			int num = sc.nextInt();
			ar.add(num);
		}
		sc.close();
		//Call the arraySum method to calculate the sum
		int sum = arraySum(ar);
		
		System.out.println(sum);
		
		
		
	}
	//Method to calculate the sum of elements in the list
			static  int arraySum(List<Integer> ar) {
				int sum = 0;
				
				//Regular for Loop to iterate over each elements in the list
				for(int num = 0; num<ar.size(); num++) {
					//Access the element using the index
					int element = ar.get(num);
					
					//Add the current element to the sum
					sum += element;
				}
				// Return the final sum
				return sum;
			}

}
