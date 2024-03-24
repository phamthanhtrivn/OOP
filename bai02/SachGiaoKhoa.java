package bai02;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	private boolean tinhTrang;
	
	public SachGiaoKhoa() {
		// TODO Auto-generated constructor stub
	}

	public SachGiaoKhoa(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong, boolean tinhTrang) {
		super(maSach, nhaXB, ngayNhap, donGia, soLuong);
		this.tinhTrang = tinhTrang;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public double thanhTien() {
		if (this.tinhTrang == true) {
			return super.getDonGia() * super.getSoLuong();
		}
		else {
			return super.getDonGia() * super.getSoLuong() *  0.5;
		}
	}
 	
	public String toString() {
		String s = "";
		if (this.tinhTrang == true) {
			s += "moi";
		}
		else {
			s += "cu";
		}
		return super.toString() + "Tinh Trang: " + s + "\n" +
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
}
