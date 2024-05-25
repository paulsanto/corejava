package collectionFrameWork;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class LinkedLise {

	public static void main(String[] args) {
		// Create an empty linked list
		LinkedList<String> l1_list = new LinkedList<>();
		
		// use add method() to add values in linked list
		l1_list.add("Red");
		l1_list.add("Green");
		l1_list.add("Black");
		l1_list.add("White");
		l1_list.add("Pink");
		l1_list.add("Yellow");
		
		//print the list
		//System.out.println("The Linked List: "+l1_list);
		
		// print the Linked List through Iterate
		for(String element: l1_list) {
			System.out.println(element);
		}
		
		System.out.println();
		
		//1.  Iterate through all elements in a linked list starting at the specified position.....
		
		// set Iterator at specified Index
		Iterator p = l1_list.listIterator(1);
		
		// print list from second position
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		
		System.out.println();
		
		//2.  Iterate a linked list in reverse order...
		
		Iterator it = l1_list.descendingIterator();
		
		// Print list element in reverse order
		System.out.println("Elements in reverse order: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3. How many times present a specific element in a list
		
		List<Integer> number = Arrays.asList(1, 2, 3, 6, 4, 3, 5, 7, 6, 5, 2, 8, 7, 9, 4);
		
		long count = Collections.frequency(number, 3);
		
		System.out.println("6 presents "+count+" times in a given list.");
		

	}

}
