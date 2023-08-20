package datastructure;

public class StringName {

	public static void main(String[] args) {
		String sr = "Sushmita Paul";
	
		for(int i=0; i<sr.length(); i++) {
			System.out.println(sr.charAt(i));
			
		}
		for(int i=sr.length()-1; i>=0; i--) {
			System.out.print(sr.charAt(i));
			
		}
		System.out.println();
		int  space = 0;
		while(sr.charAt(space) != ' ') {
			space++;
		}
		for(int i = space +1; i<sr.length(); i++) {
			System.out.print(sr.charAt(i));
		}
		System.out.print(" ");
		for(int i=0; i<space; i++) {
			System.out.print(sr.charAt(i));
		}
		System.out.println();
		
		for(int i = space-1; i>=0; i--) {
			System.out.print(sr.charAt(i));
		}
		System.out.print(" ");
		for(int i= sr.length()-1; i>space; i--) {
			System.out.print(sr.charAt(i));
		}
		
		
	}

}
