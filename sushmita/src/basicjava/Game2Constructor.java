package basicjava;
import java.util.Random;
import java.util.Scanner;

class Game{
	public int number;
	public int inputNumber;
	public int noOfGuesses=0;
	
	public int getNoOfGuessess() {
		return noOfGuesses;
	
	}
	public void setNoOfGessess(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	
	 Game() {
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	
	void takeUserInput() {
		System.out.println("Guess the Number: ");
		Scanner sc = new Scanner(System.in);
			inputNumber = sc.nextInt();	
	}
	
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputNumber == number) {
			System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts.", number, noOfGuesses);
			return true;
		}else if(inputNumber<number) {
			System.out.println("Too low....");
		}else if(inputNumber>number) {
			System.out.println("Too high...");
		}
		return false;
	}
}
public class Game2Constructor {

	public static void main(String[] args) {
		
		Game g = new Game();
		boolean b = false;
		
		while(!b) {
		g.takeUserInput();
		b = g.isCorrectNumber();
		//System.out.println(b);
		}

	}

}
