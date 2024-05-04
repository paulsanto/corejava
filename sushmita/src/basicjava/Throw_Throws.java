package basicjava;

class NegativeRediusException extends Exception{
	public String toString() {
		return "Redius cannot be negative!";
	}
	
	public String getMessage() {
		return "redius cannot be negative!";
	}
}

public class Throw_Throws {
	
	public static double area(int r) throws NegativeRediusException{
		
		if(r<0) {
			throw new NegativeRediusException();
		}
		double result = Math.PI * r * r;
		return result;
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
		int result = a/b;
		return result;
	}

	public static void main(String[] args) {
		
		try {
		int c = divide(6, 0);
		System.out.println(c);
		
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		try {
			double ar = area(-5);
			System.out.println(ar);
		}
		catch(Exception e) {
			System.out.println("Redius is negative....");
		}
	}

}
