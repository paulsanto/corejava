import java.util.*;

public class strings {
	public static void main(String args[]) {
		
		// String = a reference data type that can store one or more characters
		//            reference data types have access to useful methods
		
		//String name = "Sushmita Paul";
		
		//boolean result = name.equalsIgnoreCase("bro");
		//int result = name.length();
		//char result = name.charAt(5);
		//int result = name.indexOf("a");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
         //String result = name.toLowerCase();
		//String result = name.trim();
		//String result = name.replace('a', 'A');
		
		
		//System.out.println(result);
		
		//------------------------------------
		
		//Scanner sc = new Scanner(System.in);
	//	String name = sc.nextLine();
		//System.out.println("Your name is: "+name);
		
		//---------------------------------------------
		
		// Concatenation
		String firstName = "Tony";
		String secondName = "Stark";
		String fullName = firstName + " " +secondName;
		
		System.out.println(fullName.length());
		
		//charAt
		for(int  i=0; i<fullName.length(); i++) {
			System.out.print(fullName.charAt(i));	
		}
		
		System.out.println();
		
		for (int i=fullName.length()-1; i>=0; i--) {
			
			System.out.print(fullName.charAt(i));
		}
		
		System.out.println();
		
		for(int i=0;i<secondName.length();i++){
			
				System.out.print(secondName.charAt(i));
		}
			for(int i=0; i<firstName.length(); i++ ) {
				System.out.print(firstName.charAt(i));
				
			}
			System.out.println();
		
		
		System.out.println("-----------------------------------");
		
		String sentence = "My name is Tony";
		String sentence1 = "TonyStark";
		String name = sentence.substring(3, 7);
		String name1 = sentence1.substring(0,4);
		System.out.println(name);
		
		System.out.println("------------------------------------");
		
		String str = "123";
		int number = Integer.parseInt(str);
		
		System.out.println(number);
		
		int number1 = 123;
		String str1 = Integer.toString(number1);
		
		System.out.println(str1.length());
		
		System.out.println("----------------------------------------------");
		
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		//char at index 0
		System.out.println(sb.charAt(0));
		
		//set char at index 0
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//insert
		sb.insert(0, 'S');
		System.out.println(sb);
		
		//delete P
		sb.delete(1, 2);
		System.out.println(sb);
		
		sb.delete(2, 3);
		sb.setCharAt(0,'T');
		System.out.println(sb);
		
		
	}

}
