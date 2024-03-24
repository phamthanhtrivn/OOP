package phan03;

import java.util.*;

public class Bai05 {
	
	public static int gcd(int a, int b) {
		if (b == 0) 
			return a;
		return gcd(b, a % b);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
//		int r = a % b;
//		while (r != 0) {
//			a = b;
//			b = r;
//			r = a % b;
//		}
//		
//		System.out.println(b);
		
		System.out.println(gcd(a, b));
	}

}
