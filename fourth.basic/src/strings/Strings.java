package strings;

class CustomPrinter{
	private String formatString;
	
	CustomPrinter(String format){
		formatString = format;
	}
	
	void println(String input) {
		String formatted = String.format(formatString, input);
		System.out.println(formatted);
	}
}

public class Strings {

	public static void main(String[] args) {
		CustomPrinter print = new CustomPrinter(">> %s <<");
		String s1 = new String("Strings are arrays of characters");
		
		String s2 = new String("Strings are arrays of characters");
		
		print.println("string1: "+ s1.replace("character", "cher"));
		
		print.println("string2: " + s2);

	}

}
