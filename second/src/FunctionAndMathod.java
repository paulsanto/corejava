import java.util.*;

public class FunctionAndMathod {
	//public static void printMyName(String name) {
	//	System.out.println(name);
	//	return;
	//}
	
	//---------------------------------------------------
	
	//public static int calculateSum(int a, int b) {
	//	int sum =a+b;
	//	return sum;	
	//}
	
	//-------------------------------------------------
	
	//public static int calculateProduct(int a, int b) {
	//	return a * b;
	//}
	
	//--------------------------------------------
	//public static void calculateFactorial(int n) {
		//loop
	//	if(n < 0) {
		//	System.out.println("Invalid Number");
		//	return;
		//}
		//int factorial = 1;
		
		//for(int i=n; i>=1; i--) {
		//	factorial = factorial * i;
	//	}
	//	System.out.println(factorial);
	//}
	
	//---------------------------------
	
	//public static float calculateAverage(float a, float b, float c) {
	//	float average = (a+b+c)/3;
	//	return average;
	//}
	
	//-------------------------------------------
	
	//public static int getGreater(int a, int b) {
	//	if (a > b) {
	//		return a;
	//	}else {
	//		return b;
	//	}
	//}
	
	//----------------------------------------------------
	
	//public static int oddSum(int n) {
	//	int result = 0;
	//	for(int i=1; i<=n; i++) {
	//		if(i%2==1) {
			//result= result + i;
		//		result+=i;
		//	}
		//}return result;
		
	//}
	
	//--------------------------------------------------
	
	//public static double calculateCircum(double r) {
		
	//	 double circum= 2*3.14*r;
	//	 return  circum;
	//}  
	
	//-----------------------------------------------------
	
	 //static boolean printEligibility(int age) {
	
	//	if ( age>=18) {
	//		return true;
	//	}else {
	//		return false;
	//	}
	//}
	//------------------------------------------------
	
	static void infinite(int i) {
		do {
			System.out.println(i);
			i++;
		}while (i>10);
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		
		//printMyName(name);
	//	int a = sc.nextInt();
	//	int b = sc.nextInt();
		
		//int sum = calculateSum(a , b);
	//	System.out.println("Product of two nos.: "+ calculateProduct(a ,b));
	//	int n = sc.nextInt();
		
	//	calculateFactorial(n);
		
		//float a = sc.nextFloat();
		//float b = sc.nextFloat();
		//float c = sc.nextFloat();
		
	//	float average = calculateAverage(a , b, c);
		
	//	System.out.println("Average of three nos: "+calculateAverage(a, b, c));
		
		//int a = sc.nextInt();
	//int b = sc.nextInt();
		
		//System.out.println("print the greater no: "+getGreater(a ,b));
		
		//int n = sc.nextInt();
		
		//int result = oddSum(n);
		//System.out.println(result);
		
		//double r = sc.nextDouble();
		//double circum = calculateCircum(r);
		
		//System.out.println(calculateCircum(r));
		
		//int age = sc.nextInt();
		
		//System.out.println(printEligibility(age));
		
		infinite in = new infinite();
		
		System.out.println(infinite);
	}

}
