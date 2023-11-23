package string;

public class ReversString {

	public static void main(String[] args) {
		
		String sr = "Hello";
		
		for(int i=sr.length()-1; i>=0; i--) {
			char revers = sr.charAt(i);
			System.out.print(revers);
			
		}

	}

}
