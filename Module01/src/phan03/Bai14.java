package phan03;

import java.util.*;

public class Bai14 {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		for (int i = 7; i <= 100; i += 7) {
				sum += i;
		}
		System.out.println(sum);
	}

}
