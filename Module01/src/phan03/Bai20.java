package phan03;

public class Bai20 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 9; i++) {
			System.out.println("");
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 9; i++) {
			System.out.println("");
			for (int j = 0; j < 9 - i; j++) {
				System.out.print("* ");
			}
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("");
			for (int j = 0; j < 19; j++) {
				if (j == 9 - i) { //Ve canh ben trai
					System.out.print("* ");
				}
				else if (j == 9 + i) { //Ve canh ben phai
					System.out.print("* ");
				}
				else if (i == 9) { // Ve day
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
 		}
	}

}
