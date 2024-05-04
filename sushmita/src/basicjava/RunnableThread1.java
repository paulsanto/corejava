package basicjava;

class MyThre1 implements Runnable{
	public void run() {
		System.out.println("Jio");
	}
}
class MyThre2 extends Thread {
	MyThre2(Runnable r1, String name){
		super(r1, name);
	}
	
	public void run() {
		System.out.println("Sushmita");
	}
} 

public class RunnableThread1 {

	public static void main(String[] args) {
		MyThre1 thread1 = new MyThre1();
		Thread t1 = new Thread(thread1);
		t1.start();
		
		MyThre2 t2 = new MyThre2(thread1, "Java"); // Passing thread1 as runnable
		t2.start();
		
		System.out.println("The id of thread is: "+t2.getId());
		System.out.println("The name of thread is: "+t2.getName());
		

	}

}
