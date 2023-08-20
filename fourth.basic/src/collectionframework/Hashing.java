package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

	public static void main(String[] args) {
		//Creating
		HashSet<Integer> set = new HashSet<>();
		
		//Inserting
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		//Size
		System.out.println("size of set is: "+ set.size());
		
		//Search - contains
		/**if(set.contains(1)){
			System.out.println("set contains 1");
		}
		if(!set.contains(6)) {
			System.out.println("does not contain");
		}
		
		//Delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("does not contain 1 - we deleted 1");
		}**/
		
		//Print all elements
		System.out.println(set);
		
		//Iterator
		Iterator it = set.iterator();
		
		//hasNext, next
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
