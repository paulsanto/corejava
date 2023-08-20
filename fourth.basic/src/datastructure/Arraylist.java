package datastructure;

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist {

	public static void main(StringName[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		
		//add elements
		ar.add(0);
		ar.add(2);
		ar.add(3);
		
		System.out.println(ar);
		
		//get elements
		int element= ar.get(0);
		System.out.println(element);
		
		//add element in between
		ar.add(1, 6);
		System.out.println(ar);
		
		//change element or set element
		ar.set(0, 5);
		System.out.println(ar);
		
		//delete elements
		ar.remove(3);
		System.out.println(ar);
		
		//size
		System.out.println(ar.size());
		
		//loops
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		
		}
		
		//sorting
		Collections.sort(ar);
		System.out.println(ar);

	}

}
