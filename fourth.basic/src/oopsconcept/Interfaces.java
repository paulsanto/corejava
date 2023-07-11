package oopsconcept;

interface Animals{
	int eyes = 2;
	void walk();
	
}

interface Herbivore{
	
}

//Multiple inheritance
class Horses implements Animals, Herbivore{
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}

public class Interfaces {
	public static void main(String []args) {
		Horses horse = new Horses();
		horse.walk();
		
	}

}
