package basicjava;

public class Finally {
	
	public static int greet() {
		try {
			int a = 6;
			int b = 0;
			int c = a/b;
			return c;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Cleaning up resources....This is the end of this method.");
		}
		return -1;
	}

	public static void main(String[] args) {
		int k = greet();
		System.out.println(k);
		int a = 7;
		int b = 9;
		
		while(true) {
			try {
				System.out.println(a/b);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("I am finally the value of b = "+b);
			}
			b--;
		}
		
		try {
			System.out.println(5/2);
		}
		finally {
			System.out.println("Yes I am finally...");
		}
		}
		

	}


