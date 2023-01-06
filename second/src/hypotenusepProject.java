import java.util.Scanner;

public class hypotenusepProject {
	public static void main(String args[]) {
		
		double x;
		double y;
		double z;
		
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Enter side x: ");
		//x = scanner.nextDouble();
		//System.out.println("Enter side y: ");
		//y = scanner.nextDouble();
		
		//z = Math.sqrt((x*x)+(y*y));
		//System.out.println("The hypotenuse is: "+z);
		
		System.out.println("Enter the redius x: ");
		x = scanner.nextDouble();
		
		y = 3.14*x*x;
		System.out.println("The area of circle is: "+y);
		
		scanner.close();
	}

}
