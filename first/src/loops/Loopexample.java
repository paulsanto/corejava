package loops;

public class Loopexample {

		public static void main(String[] args) {

			int[] onedimarr = { 1, 2, 3 };
			for (int i = 0; i < 3; i++) {
				System.out.println(onedimarr[i]);
			}

			System.out.println("\n\n *****************************************");

			int[][] twodimarr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			for (int i = 0; i < 3; i++) {
				System.out.println();
				for (int j = 0; j < 3; j++) {
					System.out.print(twodimarr[i][j] + " ");
				}
			}
			System.out.println("\n\n *****************************************");

			int[][][] threedimarr = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
					{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
					{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };
			for (int i = 0; i < 3; i++) {
				System.out.println();
				for (int j = 0; j < 3; j++) {
					System.out.println();
					for (int f = 0; f < 3; f++) {
						System.out.print(threedimarr[i][j][f] + " ");
					}
				}
			}

		}

}
