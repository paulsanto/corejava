package arrays;

public class MultiDimentionalArray {
	public static void main(String args[]) {
		int arr [][][] = { { { 1, 2 , 10}, { 3, 4, 11} },{ { 5, 6, 12}, { 7, 8, 13} } };
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int f = 0; f < 3; f++) {
					System.out.print(arr[i][j][f] + " ");
				}
				System.out.println();
			}
		}
		//System.out.println(arr[0][1][2]);
		}
	}
