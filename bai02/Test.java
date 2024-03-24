package bai02;

import java.time.LocalDate;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sach[] sach = new Sach[6];
		
		sach[0] = new SachGiaoKhoa("SGK01", "Tuoi Tre", LocalDate.of(2023, 10, 20), 50000, 15, true);
		sach[1] = new SachGiaoKhoa("SGK02", "Khoa Hoc", LocalDate.of(2023, 10, 17), 40000, 12, false);
		sach[2] = new SachThamKhao("STK01", "Xuan Dong", LocalDate.of(2023, 10, 20), 50000, 11, 5000);
		sach[3] = new SachGiaoKhoa("SGK03", "Tuoi Tre", LocalDate.of(2023, 10, 20), 70000, 23, true);
		sach[4] = new SachThamKhao("STK02", "Lao Dong", LocalDate.of(2023, 10, 20), 90000, 19, 2000);
		sach[5] = new SachThamKhao("STK03", "Dan Tri", LocalDate.of(2023, 10, 20), 20000, 35, 3000);
		
		double sum = 0;
		for (Sach x : sach) {
			if (x instanceof SachGiaoKhoa) {
				sum += ((SachGiaoKhoa)x).thanhTien();
			}
		}
		System.out.printf("Tong tien cua Sach Giao Khoa: %.2f\n", sum);
		
		double sum2 = 0;
		for (Sach x : sach) {
			if (x instanceof SachThamKhao) {
				sum2 += ((SachThamKhao) x).thanhTien();
			}
		}
		System.out.printf("Tong tien cua Sach Tham Khao: %.2f\n", sum2);
		
		double avg = 0; int cnt = 0;
		for (Sach x : sach) {
			if (x instanceof SachThamKhao) {
				avg += x.getDonGia();
				cnt++;
			}
		}
		System.out.printf("Trung binh don gia cua cac Sach Tham Khao: %.2f\n", avg/cnt);
		
		System.out.print("Nhap nha xuat ban can tim: ");
		String s = sc.nextLine();
		for (Sach x : sach) {
			if (s.equals(x.getNhaXB())) {
				System.out.println(x);
			}
		}
	}

}
