package bai01;

public class Main {

	public static void main(String[] args) {
		ToaDo a = new ToaDo();
		ToaDo b = new ToaDo("A", 7.8, 6.5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.getToaDoX());
		a.setTenToaDo("A");
		System.out.println(a);
	}

}
