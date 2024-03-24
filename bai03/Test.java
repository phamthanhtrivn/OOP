package bai03;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		GiaoDich[] gd = new GiaoDich[6];
		
		gd[0] = new GiaoDichVang("4214281", LocalDate.of(2023, 9, 20), 6500000, 12, "18k");
		gd[1] = new GiaoDichTienTe("2567436", LocalDate.of(2023, 9, 19), 23000, 18, 1.5, "VN");
		gd[2] = new GiaoDichTienTe("2567446", LocalDate.of(2023, 9, 22), 23, 23, 1.2, "USA");
		gd[3] = new GiaoDichVang("4214241", LocalDate.of(2023, 9, 10), 6700000, 12, "18k");
		gd[4] = new GiaoDichTienTe("2567426", LocalDate.of(2023, 9, 8), 2, 18, 1.3, "Euro");
		gd[5] = new GiaoDichVang("4214271", LocalDate.of(2023, 9, 24), 1200000000, 23, "24K");
		
		int s = 0;
		for (GiaoDich x : gd) {
			if (x instanceof GiaoDichVang) {
				s += x.getSoLuong();
			}
		}
		System.out.printf("Tong so luong cua Giao Dich Vang: %d\n", s);
		
		int s1 = 0;
		for (GiaoDich x : gd) {
			if (x instanceof GiaoDichTienTe) {
				s1 += x.getSoLuong();
			}
		}
		System.out.printf("Tong so luong cua Giao Dich Tien Te: %d\n", s1);
		
		double avg = 0;
		int cnt = 0;
		for (GiaoDich x : gd) {
			if (x instanceof GiaoDichTienTe) {
				avg += ((GiaoDichTienTe) x).thanhTien();
				cnt++;
			}
		}
		System.out.printf("Trung binh thanh tien cua giao dich Tien Te: %.2f\n", avg/cnt);
		
		System.out.println("Giao dich co don gia > 1 ty");
		boolean check = false;
		for (GiaoDich x : gd) {
			if (x.getDonGia() > 1000000000) {
				System.out.println(x);
				check = true;
			}
		}
		if (check == false) {
			System.out.println("Khong co giao dich > 1 ty");
		}
	}

}
