package basicjava;

interface Camera {
	void takeSnap();
	void recordVideo();
	//private void greet() {
	//	System.out.println("Good morning!");
	//}
	default void record4KVideo() {
		//greet();
		System.out.println("Recording in 4K....");
	}
}

interface Wifi {
	String[] getNetWorks();

	void connectToNetwork(String network);
}

class MyCellPhone {
	void callNumber(int phoneNumber) {
		System.out.println("Calling" + phoneNumber);
	}

	void pickCall() {
		System.out.println("Connecting...");
	}
}

class MySmartPhone extends MyCellPhone implements Camera, Wifi {

	public void takeSnap() {
		System.out.println("Taking Snap");
	}

	public void recordVideo() {
		System.out.println("Recoding....");
	}
	
	//public void record4KVideo() {
	//	System.out.println("Taking Snap and Recording in 4K!");
	//}

	public String[] getNetWorks() {
		System.out.println("Getting list of Networks");
		String[] netWorkList = { "Harry", "Prasant", "Anjali5g" };
		return netWorkList;
	}
	
	public void connectToNetwork(String network) {
		System.out.println("Connecting to " + network);
	}
	
	public void sampleMeth() {
		System.out.println("Meth");
	}

}

public class MultipleInterfaces {

	public static void main(String[] args) {
		MySmartPhone msp = new MySmartPhone();
		
		msp.record4KVideo();
		
		String [] ar = msp.getNetWorks();
		for(String item : ar) {
			System.out.println(item);

		}
		
		Camera cm = new MySmartPhone();
		
		cm.record4KVideo();
		//cm.sampleMeth(); --- Not Allowed
		

	}

}
