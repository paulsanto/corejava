package basicjava;

class PracticeSet1 extends Thread{
	public void run() {
		while(true) {
			try {
				Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Good Morning...");
		}
	}
	
}
class PracticeSet2 extends Thread{
	public void run() {
		/*while(true) {
			try {
			Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Welcome...");
		}*/
	}
}


public class PracticeThreadSet {

	public static void main(String[] args) {
		
		PracticeSet1 t1 = new PracticeSet1();
		PracticeSet2 t2 = new PracticeSet2();
		//t1.setPriority(6);
		//t2.setPriority(9);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t2.getState());
		
		//t1.start();
		t2.start();
		System.out.println(t2.getState());
		System.out.println(Thread.currentThread().getState());

	}

}
