package phan03;

import java.util.*;

public class Bai07 {
	
	public static boolean prime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return n > 1;
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 2; i < n; i++) {
			if (prime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
