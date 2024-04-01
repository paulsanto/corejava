package basicjava;


class Phone{
	public void showTime() {
		System.out.println("The time is 8 am");
	}
	
	public void on() {
		System.out.println("Turning on Phone....");
	}
}

class SmartPhone extends Phone{
	public void music() {
		System.out.println("Playing music.....");
	}
	public void on() {
		System.out.println("Turning on SmartPhone.....");
	}
}
public class Dynamic_Mathod_Dispatch {

	public static void main(String[] args) {
		//Phone obj = new Phone(); // Allowed
		//SmartPhone smrobj = new SmartPhone();  // Allowed
		//obj.name();
		
		Phone obj = new SmartPhone(); // Yes its allowed
		//SmartPhone obj2 = new Phone();  // Not Allowed
		
		obj.showTime();
		obj.on();
		//obj.music(); Not allowed

	}

}
