package basicjava;
import java.util.Scanner;
import java.util.Random;

public class GameRockScissorPaper {

	public static void main(String[] args) {
		// 0 for Rock
		// 1 for Paper
		// 2 for Scissor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor!");
		int userInput = sc.nextInt();
		
		Random rd = new Random();
		int computerInput = rd.nextInt(3);
		
		if(userInput== computerInput) {
			System.out.println("Draw!");
		}else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
			System.out.println("You Win!");
		}else {
			System.out.println("Computer Win!");
		}
		
		//System.out.println("Computer choice: "+computerInput);
		
		if(computerInput==0) {
			System.out.println("Computer choose: Rock");
		}else if(computerInput == 1) {
			System.out.println("Computer choose: Paper");
		}else if(computerInput == 2){
			System.out.println("Computer choose: Scissor");
		}

	}

}
