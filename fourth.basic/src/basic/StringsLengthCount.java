package basic;

public class StringsLengthCount {

	public static void main(String[] args) {
		String s = "Sushmita";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				count++;
			
			}
		}
		System.out.println(s+ " , "+count);
		

	}

}
