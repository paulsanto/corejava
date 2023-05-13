package basic;

public class SwapNumbers {

	public static void main(String[] args) {
		int first = 10, second = 20;

		System.out.println("---Before swap---");
		System.out.println("Frist Number = " + first);
		System.out.println("Second Number = " + second);

		first = first - second;
		second = second + first;
		first = second - first;

		System.out.println("---After swap---");
		System.out.println("First Number = " + first);
		System.out.println("Second Number = " + second);

	}

}
