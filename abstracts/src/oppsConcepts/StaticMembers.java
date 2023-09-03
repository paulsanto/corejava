package oppsConcepts;


class MathUtils{
	
	
	static int add(int number1, int number2) {
		return number1 +number2;
	}
	static int subtract(int number1, int number2){
		return number1-number2;
	}
	static int multiply(int number1 , int number2) {
		return number1*number2;
	}
	static double divide(double number1, double number2) {
		if(number2 !=0) {
			return number1/number2;
		}else {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		
	}
}
public class StaticMembers {

	public static void main(String[] args) {
		int resultadd = MathUtils.add(5, 9);
		double resultdivide = MathUtils.divide(52, 8);
		int resultmultiply= MathUtils.multiply(6, 9);
		int resultsub= MathUtils.subtract(96, 51);
		
		System.out.println(resultadd);
		System.out.println(resultdivide);
		System.out.println(resultmultiply);
		System.out.println(resultsub);

	}

}
