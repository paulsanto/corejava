package hackerrankac;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] ar = new int[size];
		int sum = arraySum(ar, size);
		System.out.println(sum);
	}

	static int arraySum(int[] ar, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += i;

		}

		return sum;

	}

}
