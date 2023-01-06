package collections;

import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo {
	public static void main(String args[]) {
		
		List<Integer> arrayList = new ArrayList<>(5);
		
		for (int i = 10; i <=15; i++)
			{arrayList.add(i);}
		
		//Printing elements
		System.out.println(arrayList);
		
		//Remove elements at index 3
		arrayList.remove(3);
		
		//Displaying the ArrayList
		//After deletion
		System.out.println(arrayList);
		
		//Printing elements one by one
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
	}
		
		//for (int i : arrayList) {
		//	System.out.print(i + " ");
		//}
		}
	}

