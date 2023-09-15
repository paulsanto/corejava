package enums;

enum CoffeeSize{
	//8, 10 and 16 are passed to the constructor
	BIG(8), HUGE(10), OVERWHELMING(16);
	CoffeeSize(int ounces){//constructor
		this.ounces = ounces;
		
	}
	private int ounces; //an instance variable
	public int getOunces(){
		return ounces;
	}
}

public class DeclaringEnums {
	CoffeeSize size; //each instance of Coffee has an enum

	public static void main(String[] args) {
		DeclaringEnums drinks1 = new DeclaringEnums();
		drinks1.size = CoffeeSize.BIG;
		
		DeclaringEnums drinks2 = new DeclaringEnums();
		drinks2.size = CoffeeSize.OVERWHELMING;
		
		System.out.println(drinks1.size.getOunces()); //prints 8
	
		
		for(CoffeeSize cs : CoffeeSize.values())
			System.out.println(cs+ " " +cs.getOunces());

		

	}

}
