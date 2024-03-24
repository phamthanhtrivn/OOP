package phan03;

import java.util.Random;

public class Bai02 {

	public static void main(String[] args) {
		
//		for (int i = 1; i < 11; i++) { // for
//			System.out.println("Count is: " + i);
//		}
		
//		int count = 1; // while
//		while (count < 11) {
//			System.out.println("Count is:" + count);
//			++count;
//		}
		
//		int count = 1;
//		do {
//			System.out.println("Count is: " + count);
//			++count;
//		} while (count < 11);
		
//		Random rd = new Random(); // so ngau nhien bat ki
//		int n = rd.nextInt();
//		System.out.println("Random number: " + n);
		
//		int max = 80;
//		Random rd = new Random(); // random number
//		int n = rd.nextInt(max); // tra ve giua 0 va max
//		System.out.println("Random number: " + n);
		
		int min = 65, max = 80;
		Random rd = new Random(); // random number
		int n = rd.nextInt(max - min + 1) + min; // tra ve giua min va max
		System.out.println("Random number: " + n);
	}

}
