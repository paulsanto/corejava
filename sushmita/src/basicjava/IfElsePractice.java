package basicjava;
import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// Tax Calculation
		
		/*System.out.println("Enter your income here: ");
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
		System.out.println("The total tax paid by the employee is: "+tax);*/
		
		// Day of the Week print
		
		/*System.out.println("Enter the day number: ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Wrong entry");
			}
		*/
		
		// Find the Leap Year
		
		/*System.out.println("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4 == 0 && year%100 != 0) {
			System.out.println("This is Leap Year!");
		}
		else {
			System.out.println("This is not a Leap Year");
		}*/
		
		// Find the website
		
		System.out.println("Type the website here: ");
		Scanner sc = new Scanner(System.in);
		String website = sc.next();
		
		if(website.endsWith(".org")) {
			System.out.println("This is an organizational website.");
		}
		else if(website.endsWith(".com")) {
			System.out.println("This is a commercial website.");
		}
		else if(website.endsWith(".in")) {
			System.out.println("This is an Indian website.");
		}
		
		}

	}
