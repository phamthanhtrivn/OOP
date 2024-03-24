package bai02;

import java.time.LocalDate;

public class SachThamKhao extends Sach{
	private double thue;
	
	public SachThamKhao() {
		// TODO Auto-generated constructor stub
	}

	public SachThamKhao(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong, double thue) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	@Override
	public double thanhTien() {
		return super.getDonGia() * super.getSoLuong() + this.thue;
	}
	
	
	public String toString() {
		return super.toString() + "Thue: " + this.thue + "\n" +
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
}	
