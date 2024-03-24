package bai08;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		DanhSachBanHang ds = new DanhSachBanHang(100);
		try {
			ds.them(new HangThucPham("541", "Gao", 13000, 100,"Nam Can Tho", LocalDate.of(2023, 2, 13), LocalDate.of(2024, 2, 13)));
			ds.them(new HangDienMay("648", "May Lanh", 12000000, 50, 12, 54));
			ds.them(new HangDienMay("675", "Tu Lanh", 13000, 283, 24, 78));
			ds.them(new HangSanhSu("143", "Chen", 13000, 32,"Nam Can Tho", LocalDate.of(2023, 5, 6)));
			ds.them(new HangThucPham("825", "Pizza", 250000, 67,"Uncle Ba", LocalDate.of(2023, 6, 17), LocalDate.of(2024, 6, 17)));
			ds.them(new HangSanhSu("437", "Bat", 13000, 55,"Nam Can Tho", LocalDate.of(2023, 7, 12)));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		while (true) {
			System.out.println("========================Menu=========================");
			System.out.println("0. Thoat");
			System.out.println("1. Them hang hoa vao danh sach");
			System.out.println("2. Danh sach toan bo cac hang hoa");
			System.out.println("3. Danh sach cua tung loai hang hoa");
			System.out.println("4. Tim kiem hang hoa theo ma");
			System.out.println("5. Sap xep hang hoa theo ten hang tang dan");
			System.out.println("6. Sap xep hang hoa theo so luong ton giam dan");
			System.out.println("7. Lay thong tin cac hang thuc pham kho ban");
			System.out.println("8. Xoa hang hoa theo ma hang");
			System.out.println("9. Sua thong tin don gia khi biet ma hang");
			System.out.println("=====================================================");
			System.out.print("Chon: ");
			int lc = sc.nextInt();
			if (lc == 0) {
				break;
			}
			else if (lc == 1) {
				sc.nextLine();
				System.out.print("Nhap loai hang hoa can them: ");
				String loai = sc.nextLine();
				if (loai.trim().equalsIgnoreCase("dien may")) {
					System.out.print("Nhap ma hang: ");
					String ma = sc.nextLine();
					System.out.print("Nhap ten hang: ");
					String ten = sc.nextLine();
					System.out.print("Nhap don gia: ");
					double gia = sc.nextDouble(); sc.nextLine();
					System.out.print("Nhap so luong ton");
					int sl = sc.nextInt(); sc.nextLine();
					System.out.print("Nhap thoi gian bao hanh: ");
					int bh = sc.nextInt(); sc.nextLine();
					System.out.println("Nhap cong suat: ");
					int cs = sc.nextInt(); sc.nextLine();
					ds.them(new HangDienMay(ma, ten, gia, sl, bh, cs));
				}
				else if (loai.trim().equalsIgnoreCase("sanh su")) {
					System.out.print("Nhap ma hang: ");
					String ma = sc.nextLine();
					System.out.print("Nhap ten hang: ");
					String ten = sc.nextLine();
					System.out.print("Nhap don gia: ");
					double gia = sc.nextDouble(); sc.nextLine();
					System.out.print("Nhap so luong ton");
					int sl = sc.nextInt(); sc.nextLine();
					System.out.print("Nhap nha san xuat: ");
					String nxs = sc.nextLine();
					System.out.print("Nhap ngay nhap kho: ");
					int d = sc.nextInt(); int m = sc.nextInt(); int y = sc.nextInt(); sc.nextLine();
					ds.them(new HangSanhSu(ma, ten, gia, sl, nxs, LocalDate.of(y, m, d)));
				}
				else if (loai.trim().equalsIgnoreCase("thuc pham")) {
					System.out.print("Nhap ma hang: ");
					String ma = sc.nextLine();
					System.out.print("Nhap ten hang: ");
					String ten = sc.nextLine();
					System.out.print("Nhap don gia: ");
					double gia = sc.nextDouble(); sc.nextLine();
					System.out.print("Nhap so luong ton: ");
					int sl = sc.nextInt(); sc.nextLine();
					System.out.print("Nhap nha cung cap: ");
					String ncc = sc.nextLine();
					System.out.print("Nhap ngay san xuat: ");
					int d = sc.nextInt(); int m = sc.nextInt(); int y = sc.nextInt(); sc.nextLine();
					System.out.print("Nhap ngay het han: ");
					int d2 = sc.nextInt(); int m2 = sc.nextInt(); int y2 = sc.nextInt(); sc.nextLine();
					ds.them(new HangThucPham(ma, ten, gia, sl, ncc, LocalDate.of(y, m, d), LocalDate.of(y2, m2, d2)));
				}
				else {
					System.out.println("Loai hang hoa khong hop le!");
				}
			}
			else if (lc == 2) {
				System.out.println(ds.xuatDanhSach());		
			}
			else if (lc == 3) {
				System.out.println("--Danh sach hang thuc pham--");
				System.out.println(ds.xuatHangThucPham());
				System.out.println("--Danh sach hang dien may--");
				System.out.println(ds.xuatHangDienMay());
				System.out.println("--Danh sach hang sanh su--");
				System.out.println(ds.xuatHangSanhSu());
			}
			else if (lc == 4) {
				sc.nextLine();
				System.out.print("Nhap ma hang can tim");
				String ma = sc.nextLine();
				System.out.println(ds.timKiem(ma));
			}
			else if (lc == 5) {
				ds.sapXepHHTheoTenTangDan();
			}
			else if (lc == 6) {
				ds.sapXepHHTheoSLTGiamDan();
			}
			else if (lc == 7) {
				System.out.println(ds.hangTPKhoBan());
			}
			else if (lc == 8) {
				sc.nextLine();
				System.out.print("Nhap ma hang can xoa: ");
				String ma = sc.nextLine();
				ds.xoaHHTheoMa(ma);
			}
			else if (lc == 9) {
				sc.nextLine();
				System.out.print("Nhap ma hang can sua: ");
				String ma = sc.nextLine();
				System.out.print("Nhap don gia can sua: ");
				double gia = sc.nextDouble();
				if (ds.suaDonGia(ma, gia)) {
					System.out.println("Sua thanh cong!");
				}
				else {
					System.out.println("Khong tim thay ma can sua!");
				}
			}
			else {
				System.out.println("Lua chon khong hop le!");
			}
		}
	}

}
