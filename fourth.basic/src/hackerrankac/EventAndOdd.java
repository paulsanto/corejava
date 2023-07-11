package hackerrankac;

public class EventAndOdd {

	public static void main(String[] args) {
		int [] ar = {1, 2, 3, 4, 5, 15, 16, 23, 64, 69, 83};
		int [] evenNumber = new int[ar.length];
		int [] oddNumber = new int[ar.length];
		int evenCount = 0;
		int oddCount = 0;
		int num;
		for(int i = 0; i<ar.length; i++)  {
			num = ar[i];
			
			if(num%2==0) {
				evenNumber[evenCount] = num;
				evenCount = evenCount + 1;
			}else {
				oddNumber[oddCount] = num;
				oddCount = oddCount + 1;
			}
		}
		// Printing even numbers
		System.out.println("Even numbers are: ");
		for(int i=0; i<evenCount; i++) {
			System.out.print(evenNumber[i]+ " ");
		}
		System.out.println();
		// Printing odd numbers
		System.out.println("Odd numbers are: ");
		for(int i= 0; i<oddCount; i++) {
			System.out.print(oddNumber[i]+ " ");
		}

	}

}
