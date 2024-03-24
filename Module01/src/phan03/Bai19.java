package phan03;

public class Bai19 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 9; i++) {
			//Ve cot dau tien
			System.out.print("\n* ");
			for (int j = 1; j <= i; j++) {
				if (j < i && i < 8) { //Ve khoang trang
					System.out.print("  ");
				}
				else if (j < i && i == 8) { //Ve canh duoi cung
					System.out.print("* ");
				}
				else if (j == i){ // Ve duong cheo
					System.out.print("* ");
				}
			}
		}
		
		System.out.println("\n");
		for (int i = 0; i < 9; i++) {
			System.out.print("\n* "); // Ve canh ben trai
			for (int j = 1; j < 9; j++) {
				if (j == 8) { // Ve canh ben phai
					System.out.print("* ");
				}
				else if (j < 8 && i == 0) { //Ve canh ben tren
					System.out.print("* ");
				}
				else if (j < 8 && i == 8) { //Ve canh ben duoi 
					System.out.print("* ");
				}
				else if (j == i) { // Ve duong cheo '\'
					System.out.print("* ");
				}
				else if (j == 8 - i) {
					System.out.print("* ");// Ve duong cheo '/'
				}
				else {
					System.out.print("  ");
				}
			}
		}
		
		System.out.println("\n");
		for (int i = 0; i < 9; i++) {
			System.out.println("");
			for (int j = 0; j < 9; j++) {
				if (j == i) { // Ve duong cheo '\'
					System.out.print("* ");
				}
				else if (j == 8 - i) {
					System.out.print("* "); // Ve duong cheo '/'
				}
				else if (i == 4) {
					System.out.print("* "); // Ve duong ngang
				}
				else {
					System.out.print("  ");
				}
			}
		}

	}

}
