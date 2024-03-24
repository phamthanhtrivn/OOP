package phan03;

import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		if (a == 0) {
			if (b != 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else {
				System.out.println("Phuong trinh co vo so nghiem");
			}
		}
		else {
			if (b != 0) {
				System.out.printf("%.1f\n", -b*1.0/a);
			}
			else {
				System.out.println(0);
			}
		}
	}

}
