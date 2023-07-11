package hackerrankac;

public class ArrayString {

	public static void main(String[] args) {
		String [] st = {"Sushmita", "Anjana", "Sangita", "Deboshree", "Madhumita"};
        
		for(int i = 0; i<st.length; i++ ) {
			
			System.out.println(st[i]);
		}
		//Iterate over each string in the array
		for(int i=0; i<st.length; i++) {
			String str = st[i];
			
			int count = 0;
			
			//Convert the string to a character array
			char[] charArray = new char[str.length()];
			for(int j=0; j<str.length(); j++) {
				charArray[j] = str.charAt(j);
				if(j != ' ')
					count++;
			}
			System.out.println(str + " , "+ count);
			/**int count =0;
			//Perform operation on the character array
			for(int p =0; p<charArray.length; p++) {
				
				char c = charArray[p];
				if(c!= ' ')
					count++;
				
				//Access and perform operations on each character individually
				System.out.print(c+" , "+ count);
			}**/
			System.out.println();
		}
	}

}
