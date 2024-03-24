package bai06;

import java.time.LocalDate;
import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
//		HoaDon[] hd = new HoaDon[7];
//		
//		hd[0] = new HoaDonTheoGio("G001", LocalDate.of(2023, 7, 12), "Pham Thanh Tri", "P102", 100, 12); 
//		hd[1] = new HoaDonTheoNgay("N001", LocalDate.of(2023, 2, 12), "Nguyen Xuan Hoa", "P304", 250, 23);
//		hd[2] = new HoaDonTheoGio("G002", LocalDate.of(2023, 5, 7), "Le Van Luyen", "P104", 90, 7); 
//		hd[3] = new HoaDonTheoGio("G003", LocalDate.of(2023, 9, 24), "Dam Vinh Hung", "P201", 200, 4); 
//		hd[4] = new HoaDonTheoNgay("N002", LocalDate.of(2022, 1, 19), "Nguyen Ba Danh", "P401", 250, 6);
//		hd[5] = new HoaDonTheoNgay("N003", LocalDate.of(2023, 8, 2), "Cao Ba Quat", "P207", 250, 2);
//		hd[6] = new HoaDonTheoGio("G004", LocalDate.of(2023, 10, 6), "Ho Van Danh", "P108", 150, 26); 
		
		DachSachHoaDon ds = new DachSachHoaDon(100);
		do {
			System.out.println("=================================Menu==============================");
			System.out.println("0. Thoat");
			System.out.println("1. Them 1 hoa don vao danh sach");
			System.out.println("2. Thong ke so luong hoa don theo gio");
			System.out.println("3. Thong ke so luong hoa don theo ngay");
			System.out.println("4. Tinh tong thanh tien cua hoa don");
			System.out.println("5. In ra danh sach hoa don");
			System.out.println("===================================================================");
			System.out.println("Chon: ");
			int lc = sc.nextInt();
			if (lc == 0) {
				break;
			}
			else if (lc == 1) {
				sc.nextLine();
				System.out.println("Nhap Hoa don can nhap(gio/ngay): ");
				String s = sc.nextLine();
				if (s.toLowerCase().trim().equals("gio")) {
					System.out.println("Nhap ma HD: ");
					String ma = sc.nextLine();
					System.out.println("Nhap ngay/thang/nam: ");
					int d = sc.nextInt(); sc.nextLine();
					int m = sc.nextInt(); sc.nextLine();
					int y = sc.nextInt(); sc.nextLine();
					System.out.println("Ho Ten: ");
					String ten = sc.nextLine();
					System.out.println("Ma phong: ");
					String p = sc.nextLine();
					System.out.println("Don gia: ");
					double gia = sc.nextDouble();
					sc.nextLine();
					System.out.println("So gio thue: ");
					int gio = sc.nextInt();
					sc.nextLine();
					HoaDon hd = new HoaDonTheoGio(ma, LocalDate.of(y, m, d), ten, p, gia, gio);
					ds.them(hd);
				}
				else if (s.toLowerCase().trim().equals("ngay")) {
					System.out.println("Nhap ma HD: ");
					String ma = sc.nextLine();
					System.out.println("Nhap ngay/thang/nam: ");
					int d = sc.nextInt(); sc.nextLine();
					int m = sc.nextInt(); sc.nextLine();
					int y = sc.nextInt(); sc.nextLine();
					System.out.println("Ho Ten: ");
					String ten = sc.nextLine();
					System.out.println("Ma phong: ");
					String p = sc.nextLine();
					System.out.println("Don gia: ");
					double gia = sc.nextDouble();
					sc.nextLine();
					System.out.println("So ngay thue: ");
					int ngay = sc.nextInt();
					sc.nextLine();
					HoaDon hd = new HoaDonTheoNgay(ma, LocalDate.of(y, m, d), ten, p, gia, ngay);
					ds.them(hd);
				}
				else {
					System.out.println("Khong hop le!\n");
				}
			}
			else if (lc == 2) {
				System.out.printf("So luong hoa don theo ngay: %d\n", ds.thongKeSoLuongHDTheoGio());			
			}
			else if (lc == 3) {
				System.out.printf("So luong hoa don theo ngay: %d\n", ds.thongKeSoLuongHDTheoGio());		
			}
			else if (lc == 4) {
				System.out.println("Nhap thang: ");
				int m = sc.nextInt();
				System.out.println("Nhap nam: ");
				int y = sc.nextInt();
				System.out.printf("Tong thanh tien cua hoa don thang %d nam %d la: %.2f\n", m, y, ds.tinhTongThanhTien(m, y));		
			}
			else if (lc == 5) {
				System.out.println(ds);
			} 
		} while (true);
	}

}
