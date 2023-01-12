package a_basic;
import java.util.*;

public class array2d {
	public static void main(String args[]) {
		
		//2D array = an array of arrays
		
		//String[][] cars = {  {"Camaro","Corvette","Silverado"},
		//		             {"Mustang","Ranger","F-150"}, 
		//		             {"Ferrari","Lambo","Tesla"}
		//		           }; 
		
	//	cars[0][0] = "Camaro";
	//	cars[0][1] = "Corvette";
		//cars[0][2] = "Silverado";
	//	cars[1][0] = "Mustang";
	//	cars[1][1] = "Ranger";
	//	cars[1][2] = "F-150";
	//	cars[2][0] = "Ferrari";
	//	cars[2][1] = "Lambo";
		//cars[2][2] = "Tesla";
		
		//for(int i=0; i<cars.length; i++) {
		//	System.out.println();
		//	for(int j=0; j<cars[i].length; j++) {
		//		System.out.print(cars[i][j]+" ");
		//	}
		//}
		
		//---------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		//int rows = sc.nextInt();
		//int colms = sc.nextInt();
		
	//	int [][] numbers = new int[rows][colms];
		
	//	for(int i=0; i<rows; i++) {
	//		for (int j=0; j<colms; j++) {
	//			numbers[i][j]=sc.nextInt();
	//		}
	//	}
		
	//	for(int i=0; i<rows; i++) {
		//	for(int j=0; j<colms; j++) {
	//			System.out.print(numbers[i][j]+" ");
	//		}
	//		System.out.println();
	//	}
	//	int x = sc.nextInt();
		
	//	for(int i=0; i<rows; i++) {
	//		for(int j=0; j<colms; j++) {
	//			if(numbers[i][j]== x) {
	//				System.out.println("x found at locations("+ i +","+ j+")");
	//			}
	//		}
	//	}
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] Matrix = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				Matrix[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("The transpose is: ");
		
		for(int j=0; j<M;j++) {
			for (int i=0; i<N; i++) {
				System.out.print(Matrix[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
