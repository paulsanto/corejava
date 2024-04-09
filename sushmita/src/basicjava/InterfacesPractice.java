package basicjava;

interface Bicycle{
	int a = 45;
	void applyBrake(int decrement);
	void speedUp(int increment);
}

interface HornBicycle{
	void blowHornK3g();
	void blowHornMHN();
}

class AvonCycle implements Bicycle, HornBicycle{
	void blowHorn() {
		System.out.println("Pee Pee Poo poo....");
	}
	
	public void applyBrake(int decrement) {
		System.out.println("Applying Brake!");
	}
	public void speedUp(int increment) {
		System.out.println("Applying SpeedUp!");
	}
	
	public void blowHornK3g() {
		System.out.println("Kabhi Khusi Kabhi Gum");
	}
	public void blowHornMHN() {
		System.out.println("Mai Hu Na Poo Poo Poo");
	}
}


public class InterfacesPractice {

	public static void main(String[] args) {
		AvonCycle ac = new AvonCycle();
		
		ac.applyBrake(1);
		//You can create properties in interfaces
		System.out.println(ac.a);
		
		// You can not modify properties in interfaces as they are final;
		//ac.a = 456;
		//System.out.println(ac.a);
		
		ac.blowHorn();
		ac.blowHornK3g();
		ac.blowHornMHN();

	}

}
