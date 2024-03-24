package phan03;

import java.util.*;

public class Bai12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 10;
		int cnt = 0, sum = 0, i = 0;
		while (cnt < n) {
			if (i % 2 == 0) {
				sum += i;
				cnt++;
			}
			i++;
		}
		System.out.println(sum);
	}

}
