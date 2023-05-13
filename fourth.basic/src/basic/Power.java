package basic;

public class Power {

	public static void main(String[] args) {
		int num = 6, expo = 3;

		// 1. pow() method
		System.out.println("the result is: " + Math.pow(num, expo));
		
		
		// 2. for loop method
		int result = 1;
		for (int i = 1; i <= expo; i++) {
			result = num * result;
		}
		System.out.println("The power of the number is: " + result);
	}

}
