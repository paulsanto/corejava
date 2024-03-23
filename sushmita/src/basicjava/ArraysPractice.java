package basicjava;
import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		// 1. Take 10 integer inputs from user and store them in an array and print them on screen
		
		/*Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The input array is: ");
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}*/
		
		/*// 2. Find the max and min number in an array
		
		int [] arr = {25, 47, 12, 69, 14};
		int max = 0;
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println("The maximum value is: "+max);
		System.out.println("The minimum value is: "+min);
		*/
		
		/*// 3. Print reverse array
		
		int [] arr = {24, 41, 25, 78, 65, 257};
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		
		for(int i=0; i<n;i++) {
			// Swap a[i] and a[l-1-i]
			// |3| |4| | |
			
			temp = arr[i];
			arr[i] = arr[l-1-i];
			arr[l-1-i] = temp;
			
		}
		for(int element: arr) {
			System.out.print(element+" ");
		}
		*/
		
		// find is the array sorted or not
		
		boolean isSorted = true;
		int [] arr = {24, 41, 25, 78, 65, 257};
		
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isSorted = false;
				break;
			}
			
		}
		if(isSorted) {
			System.out.println("This array is sorted!");
		}else {
			System.out.println("This array is not sorted!");
		}

	}

}
