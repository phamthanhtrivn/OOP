package phan02;

public class Bai04 {

	public static void main(String[] args) {
		
		int i = 3;
		i++; // i = 3 + 1 = 4
		System.out.println(i); // in ra i = 4
		++i; // i = 4 + 1 = 5
		System.out.println(i); // in ra i = 5
		System.out.println(++i); // in ra i = 6
		System.out.println(i++); // in ra i = 6 sau dó in mới đc cộng 1 thành 7
		System.out.println(--i); // i = 6
		System.out.println(i--); // int ra i = 6 sau đó i bị trừ đi 1 thành 5
		System.out.println(i); // in ra i = 5
	}

}
