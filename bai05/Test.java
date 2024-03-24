package bai05;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		KhachHang[] kh = new KhachHang[6];
		
		kh[0] = new KhachHangNuocNgoai("NG001", "David Laid", LocalDate.of(2023, 7, 12), 124, 3.8, "USA");
		kh[1] = new KhachHangVietNam("VN001", "Pham Thanh Tri", LocalDate.of(2018, 9, 24), 56, 3.8, "sinh hoat", 100);
		kh[2] = new KhachHangNuocNgoai("NG002", "Chris Brown", LocalDate.of(2018, 9, 30), 98, 3.8, "USA");
		kh[3] = new KhachHangVietNam("VN002", "Nguyen Van An", LocalDate.of(2023, 9, 12), 178, 3.8, "kinh doanh", 150);
		kh[4] = new KhachHangVietNam("VN003", "Le Van Luyen", LocalDate.of(2023, 5, 5), 750, 3.8, "san xuat", 500);
		kh[5] = new KhachHangNuocNgoai("NG003", "Carl Kent", LocalDate.of(2020, 4, 12), 111, 3.8, "USA");
		
		
		int sum = 0;
		for (KhachHang x : kh) {
			if (x instanceof KhachHangVietNam) {
				sum += x.getSoKWTieuThu();
			}
		}
		System.out.printf("Tong so KW tieu thu cua khach hang VN: %d\n", sum);
		
		int sum2 = 0;
		for (KhachHang x : kh) {
			if (x instanceof KhachHangNuocNgoai) {
				sum2 += x.getSoKWTieuThu();
			}
		}
		System.out.printf("Tong so KW tieu thu cua khach hang VN: %d\n", sum2);
		
		double avg = 0;
		int cnt = 0;
		for (KhachHang x : kh) {
			if (x instanceof KhachHangNuocNgoai) {
				avg += ((KhachHangNuocNgoai) x).thanhTien();
				++cnt;
			}
		}
		System.out.printf("Tong trung binh thanh tien cua khach hang nuoc ngoai: %.2f\n\n", avg/cnt);
		
		System.out.println("Cac hoa don trong thang 9 nam 2013");
		for (KhachHang x : kh) {
			if (x.getNgayLapHoaDon().getMonthValue() == 9 && x.getNgayLapHoaDon().getYear() == 2018) {
				System.out.println(x);
			}
		}
	}

}
