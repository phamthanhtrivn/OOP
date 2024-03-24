package phan03;

import java.util.*;

public class Bai11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				++cnt;
			}
		}
		System.out.println(cnt);
	}

}
