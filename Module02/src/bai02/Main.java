package bai02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien sv1 = new SinhVien(22687551, "Pham Thanh Tri", 6.5, 8.5);
		SinhVien sv2 = new SinhVien(22687741, "Tran Minh Tri", 7.5, 8.0);
		SinhVien sv3 = new SinhVien();
		System.out.println("Nhap ma so cua sinh vien sv3: ");
		sv3.setMaSV(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhap ho va ten cua sinh vien sv3: ");
		sv3.setHoTen(sc.nextLine());
		System.out.println("Nhap diem ly thuyet cua sinh vien sv3: ");
		sv3.setDiemLT(sc.nextDouble());
		System.out.println("Nhap diem thuc hanh cua sinh vien sv3: ");
		sv3.setDiemTH(sc.nextDouble());
		System.out.printf("%-10s %-30s %10s %10s %10s\n", "masv", "hoten", "diemlt", "diemth", "diemtb");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}

}
