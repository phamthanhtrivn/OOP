package bai09;

import java.util.Arrays;
import java.util.Comparator;

public class Management {
	private Person[] list;
	private int count;
	
	public Management(int n) {
		list = new Person[n];
		this.count = 0;
	}
	
	public void them(Person ps) {
		list[count++] = ps;
	}
	
	public int tim(String hoTen) {
		for (int i = 0; i < this.count; i++) {
			if (list[i].getHoTen().equalsIgnoreCase(hoTen)) {
				return i;
			}
		}
		return -1;
	}
	
	public void xoa(String hoTen) {
		int kq = tim(hoTen);
		if (kq == -1) {
			System.out.println("Khong the tim ho ten can xoa!");
		}
		else {
			for (int i = kq; i < this.count - 1; i++) {
				list[i] = list[i + 1];
			}
			System.out.println("Xoa thanh cong!");
		}
	}
	
	public void sapXepTheoHoTenTangDan() {
		Arrays.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
			
		});
	}
	
	public void xuatDanhSach() {
		System.out.println("\n\t\t================Danh sach===============");
		for (int i = 0; i < this.count; i++) {
			System.out.println(list[i]);
		}
	}
}
