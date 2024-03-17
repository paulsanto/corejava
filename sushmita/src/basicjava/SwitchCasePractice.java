package basicjava;
import java.util.Scanner;

public class SwitchCasePractice {

	public static void main(String[] args) {
		// Write a program to check whether a character is vowel or consonant using switch statement
		
		System.out.println("Enter the input: ");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<= 'Z') || (ch>='a' && ch<='z')){
			
			switch(ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("This is a Vowel!");
				break;
				
				default:
					System.out.println("This is a Consonant!");
			
			}
			
			}
		else {
			System.out.println("Invalid input");
				
		}
		

	}

}
