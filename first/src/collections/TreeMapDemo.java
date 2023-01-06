package collections;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String args[]) {
		
		TreeMap<Integer , String> treeMap = new TreeMap<>();
	
		treeMap.put(2 ,  "B");
		treeMap.put(3 ,  "A");
		treeMap.put(1 ,  "C");
		
		System.out.println(treeMap);
		System.out.println("Size of treemap is:" + treeMap.size());
		
		
	}

}
