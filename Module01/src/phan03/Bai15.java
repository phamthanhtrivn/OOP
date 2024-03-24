package phan03;

import java.util.*;

public class Bai15 {
	
	public static long Max(long n) {
		long max = -1000000000;
		while (n != 0) {
			long r = n % 10;
			if (r >= max) {
				max = r;
			}
			n /= 10;
		}
		return max;
	}
	
	public static long Min(long n) {
		long min = 1000000000;
		while (n != 0) {
			long r = n % 10;
			if (r <= min) {
				min = r;
			}
			n /= 10;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println("Max: " + Max(n));
		System.out.println("Min: " + Min(n));
		
	}

}
