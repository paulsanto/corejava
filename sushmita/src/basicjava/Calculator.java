package basicjava;

class InvalidInputException extends Exception{
	@Override
	public String toString() {
		return "Cannot add 8 & 9";
	}
	
	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}
class CannotDivideByZeroException extends Exception{
	@Override
	public String toString() {
		return "Cannot divide by zero";
	}
	
	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}

class MaxInputException extends Exception{
	@Override
	public String toString() {
		return "Input cannot be greater then 100000";
	}
	
	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}

class CustomeCalculator{
	double add(double a, double b) throws InvalidInputException, MaxInputException {
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		if(a==8 || b==9) {
		 throw new InvalidInputException();
		}
		return a+b;
	}
	double substruct(double a, double b) throws MaxInputException{
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		return a-b;
	}
	double multiply(double a, double b) throws MaxInputException{
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		return a*b;
	}
	double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		if(b==0) {
			throw new CannotDivideByZeroException();
		}
		return a/b;
	}
	
}
public class Calculator {

	public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException{
		CustomeCalculator cc = new CustomeCalculator();
		//cc.add(8, 9);		
		cc.divide(8, 0);
		

	}

}
