package ifelse;
import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// Tax Calculation
		
		System.out.println("Enter your income here: ");
		Scanner sc = new Scanner(System.in);
		
		float income = sc.nextFloat();
		float tax = 0;
		
		if(income <= 2.5f) {
			tax = tax + 0;
		}
		else if(income>2.5f && income<=5.0f) {
			tax = tax + .05f * (income-2.5f);
		}
		else if(income>5.0f && income<=10.0f) {
			tax = tax + .05f * (5.0f - 2.5f);
			tax = tax + .2f * (income - 5.0f);
		}
		else if(income>10.0f) {
			tax = tax + .05f * (5.0f - 2.5f);
			tax = tax + .2f * (10.0f - 5.0f);
			tax = tax + .3f * (income - 10.0f);
			
		}
		System.out.println("The total tax paid by the employee is: "+tax);

	}

}
