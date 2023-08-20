package collectionframework;

import java.util.*;

public class Hashing1 {

	public static void main(String[] args) {
		//country(key), population(value)
		HashMap<String, Integer> hm = new HashMap<>();
		
		//Insertion
		hm.put("India", 120);
		hm.put("US", 30);
		hm.put("China", 150);
		
		System.out.println(hm);
		
		hm.put("China", 180);
		System.out.println(hm);
		
		//Search
		if(hm.containsKey("Indonesia")) {
			System.out.println("Key is present in the map");
		}else {
			System.out.println("Key is not present in the map");
		}
		
		System.out.println(hm.get("China")); // key exists
		System.out.println(hm.get("Indonesia")); // key doesn't exists

		/**int arr[] = {12, 15, 18};
		for(int i=0; i<3; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
		System.out.println();**/
		
		for(Map.Entry<String, Integer> e: hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key+ " " + hm.get(key));
		}
		
		hm.remove("China");
		System.out.println(hm);
	}

}
