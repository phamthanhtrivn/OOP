package bai09;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong cua danh sach:");
		int n = sc.nextInt();
		Management list = new Management(n);
		Person ps = new Person();
		while (true) {
			System.out.println("=====================Menu====================");
			System.out.println("0. Thoat");
			System.out.println("1. Them 1 nguoi vao danh sach");
			System.out.println("2. Xoa 1 nguoi khoi danh sach");
			System.out.println("3. Sap xep danh sach theo ho ten tang dan");
			System.out.println("4. Xuat danh sach");
			System.out.println("=============================================");
			System.out.println("Chon: ");
			int lc = sc.nextInt();
			if (lc == 0) {
				break;
			}
			else if (lc == 1) {
				sc.nextLine();
				System.out.println("Nhap loai nguoi can them: ");
				String loai = sc.nextLine();
				if (loai.trim().equalsIgnoreCase("sinh vien")) {
					System.out.print("Nhap ho ten: ");
					String ten = sc.nextLine();
					System.out.print("Nhap dia chi: ");
					String dc = sc.nextLine();
					System.out.print("Diem mon hoc 1:");
					double d1 = sc.nextDouble();
					System.out.print("Diem mon hoc 2:");
					double d2 = sc.nextDouble();
					sc.nextLine();
					ps = new Student(ten, dc, d1, d2);
					list.them(ps);
				}
				else if (loai.trim().equalsIgnoreCase("nhan vien")) {
					System.out.print("Nhap ho ten: ");
					String ten = sc.nextLine();
					System.out.print("Nhap dia chi: ");
					String dc = sc.nextLine();
					System.out.print("He so luong:");
					double hs = sc.nextDouble();
					sc.nextLine();
					ps = new Employee(ten, dc, hs);
					list.them(ps);
				}
				else if (loai.trim().equalsIgnoreCase("khach hang")) {
					System.out.print("Nhap ho ten: ");
					String ten = sc.nextLine();
					System.out.print("Nhap dia chi: ");
					String dc = sc.nextLine();
					System.out.print("Ten cong ty: ");
					String ct = sc.nextLine();
					System.out.print("Tri gia hoa don: ");
					double tg = sc.nextDouble(); sc.nextLine();
					System.out.print("Danh gia: ");
					String dg = sc.nextLine();
					sc.nextLine();
					ps = new Customer(ten, dc, ct, tg, dg);
					list.them(ps);
				}
				else {
					System.out.println("Loai nguoi nay khong co trong he thong!");
				}
			}
			else if (lc == 2) {
				sc.nextLine();
				System.out.println("Nhap ho ten can xoa: ");
				String ten = sc.nextLine();
				list.xoa(ten);			
			}
			else if (lc == 3) {
				list.sapXepTheoHoTenTangDan();
			}
			else if (lc == 4) {
				list.xuatDanhSach();
			}
			else {
				System.out.println("Lua chon khong hop le!");
			}
		}
	}

}
