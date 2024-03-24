package phan03;

import java.util.*;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		for (String x : arr) {
			System.out.println(x);
		}
	}

}
