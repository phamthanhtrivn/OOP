package phan02;

public class Bai05 {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		System.out.println("value1 == value2: " + (value1 == value2));
		System.out.println("value1 != value2: " + (value1 != value2));
		System.out.println("value1 > value2: " + (value1 > value2));
		System.out.println("value1 < value2: " + (value1 < value2));
		System.out.println("value1 <= value2: " + (value1 <= value2));
		System.out.println("(value1 <= value2) && (value1 == value2): " 
							+ ((value1 <= value2) && (value1 == value2)) );
		System.out.println("(value1 <= value2) || (value1 == value2): " 
							+ ((value1 <= value2) || (value1 == value2)) );
	}

}
