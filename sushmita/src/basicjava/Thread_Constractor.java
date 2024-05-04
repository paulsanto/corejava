package basicjava;


class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("Thank you!");
		//while(true) {
		//	System.out.println("I am a thread!");
		//}
	}
}

public class Thread_Constractor {

	public static void main(String[] args) {
		MyThr t1 = new MyThr("Sushmita");
		MyThr t2 = new MyThr("Indranil");
		
		
		t1.start();
		t2.start();
		System.out.println("The id of t1 thread is: "+t1.getId());
		System.out.println("The name of t1 thread is: "+t1.getName());
		System.out.println("The id of t2 thread is: "+t2.getId());
		System.out.println("The name of t2 thread is: "+t2.getName());
		

	}

}
