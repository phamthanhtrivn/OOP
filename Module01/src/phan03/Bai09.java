package phan03;

import java.util.*;

public class Bai09 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int cnt = 0;
		char kitu = 'a';
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
