package phan03;
import java.util.*;
public class Bai06 {
	
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
		if (prime(n)) {
			System.out.println(n + " la so nguyen to");
		}
		else {
			System.out.println(n + " khong la so nguyen to");
		}

	}

}
