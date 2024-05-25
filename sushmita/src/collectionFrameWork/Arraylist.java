package collectionFrameWork;
import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		ArrayList<Integer> l2 = new ArrayList<>();
		
		l1.add(6);
		l1.add(7);
		l1.add(4);
		l1.add(6);
		l1.add(5);
		l2.add(12);
		l2.add(15);
		l2.add(18);
		
		l1.add(0, 1);
		l1.add(0, 9);
		
		l1.addAll(0, l2);
		System.out.println(l1.contains(21));
		
		l1.set(2, 142);
		
		//l1.clear();
		System.out.println(l1.indexOf(6));
		System.out.println(l1.lastIndexOf(6));
		
		// convert ArrayList to Array
		Integer[] array = l1.toArray(new Integer[0]); // Pass an array of appropriate size
		
		//print the element of the array
		System.out.println("Elements of the Array: ");
		for(int element: l1) {
			System.out.print(element);
			System.out.print(", ");
		}
		System.out.println();
		
		// Sort the ArrayList
		Collections.sort(l1);
		
		System.out.println("Print the sorted ArrayList: ");
		
		for(int i = 0; i<l1.size(); i++) {
			System.out.print(l1.get(i));
			System.out.print(", ");
		}
		
				

	}

}
