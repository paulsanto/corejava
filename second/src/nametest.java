
public class nametest {
	public static void main(String args[]) {
		
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
		
		/*for(int i=0;i<secondName.length();i++){
			
				System.out.print(secondName.charAt(i));
		}
			for(int i=0; i<firstName.length(); i++ ) {
				System.out.print(firstName.charAt(i));
			}*/
		int pos = 0;
		while (fullName.charAt(pos) != ' ') {
			pos++;
		}
		for (int i = pos + 1; i < fullName.length(); i++) {
			System.out.print(fullName.charAt(i));
		}
		System.out.print(" ");
		for (int i = 0; i < pos; i++) {
			System.out.print(fullName.charAt(i));
		}
	}
}
