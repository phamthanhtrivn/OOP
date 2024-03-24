package phan03;

import java.util.*;

public class Bai08 {
	
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
		int sum = 0, cnt = 0;
		int i = 2;
		while (cnt < n) {
			if (prime(i)) {
				sum += i;
				cnt++;
			}
			i++;
		}
		System.out.println(sum);
		
	}

}
