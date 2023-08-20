package collectionframework;

import java.util.*;


public class LinkedListString {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//add elements
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addFirst("this");
		list.addLast("list");
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//iterate
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+ "->");
		}
		System.out.println("null");
		
		//remove
		list.removeFirst();
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);

	}

}
