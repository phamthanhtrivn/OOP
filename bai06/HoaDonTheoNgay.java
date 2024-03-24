package bai06;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon{
	private int soNgayThue;
	
	@Override
	public double thanhTien() {
		if (this.soNgayThue > 7) {
			return 7 * super.getDonGia() + (this.soNgayThue - 7) * super.getDonGia() * 0.2;
		}
		else {
			return this.soNgayThue * super.getDonGia();
		}
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"So Ngay Thue: " + this.soNgayThue + "\n" +
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
	public HoaDonTheoNgay() {
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String hoTen, String maPhong, double donGia, int soNgayThue) {
		super(maHoaDon, ngayHoaDon, hoTen, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}
	
	
}
