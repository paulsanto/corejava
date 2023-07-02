package hackerrankac;

import java.util.Scanner;

public class JavaDataType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**long i = sc.nextLong();

		if (i > Byte.MIN_VALUE && i < Byte.MAX_VALUE) {
			System.out.println("* Byte");
		} else if (i > Short.MIN_VALUE && i < Short.MAX_VALUE) {
			System.out.println("* Short");
		}

		else if (i > Integer.MIN_VALUE && i < Integer.MAX_VALUE) {
			System.out.println("* Integer");
		} else if (i > Long.MIN_VALUE && i < Long.MAX_VALUE) {
			System.out.println("* Long");
		} else {
			System.out.println(i + "can't be fitted anywhere");
		}**/

		int t = sc.nextInt();

		for (int j = 0; j < t; j++) {
		
			try{
				long i = sc.nextLong();
			   System.out.println(i+ "can be fitted in: ");
				
				if (i>Byte.MIN_VALUE && i<Byte.MAX_VALUE) {
					System.out.println("* Byte");
				}
				if(i>Short.MIN_VALUE && i<Short.MAX_VALUE) {
					System.out.println("* Short");
				}
				if(i>Integer.MIN_VALUE && i<Integer.MAX_VALUE) {
					System.out.println("* Integer");
				}
				if(i>Long.MIN_VALUE && i<Long.MAX_VALUE) {
					System.out.println("* Long");
				}
			}catch(Exception e) {
					System.out.println("can't be fitted anywhere"+ e.getMessage());
				}
			
			}
		
		}
		

	}
