package phan03;

import java.util.*;

public class Bai16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		if (n % 2 == 0) {
			System.out.println("Even");
		}
		else if (n % 2 == 1){
			System.out.println("Odd");
		}
		else {
			System.out.println("Zero");
		}
	}

}
