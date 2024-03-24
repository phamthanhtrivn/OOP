package bai05;

import java.time.LocalDate;

public class KhachHangVietNam extends KhachHang{
	private String doiTuong;
	private int dinhMuc;
	
	@Override
	public double thanhTien() {
		if (super.getSoKWTieuThu() <= this.dinhMuc) {
			return super.getSoKWTieuThu() * super.getDonGia();
		}
		else {
			return super.getSoKWTieuThu() * super.getDonGia() * this.dinhMuc + (this.dinhMuc - super.getSoKWTieuThu()) * super.getDonGia() * 2.5;
		}
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Doi Tuong: " + this.doiTuong + "\n" + 
				"Dinh Muc: " + this.dinhMuc + "\n" +
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
	public KhachHangVietNam() {
		// TODO Auto-generated constructor stub
	}

	public KhachHangVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, int soKWTieuThu, double donGia, String doiTuong, int dinhMuc) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
		if (checkDoiTuong(doiTuong) == true) {
			this.doiTuong = doiTuong;
		}
		else {
			this.doiTuong = "";
		}
		this.dinhMuc = dinhMuc;
	}
	
	public boolean checkDoiTuong(String doiTuong) {
		if (doiTuong.equals("sinh hoat") || doiTuong.equals("kinh doanh") || doiTuong.equals("san xuat")) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getDoiTuong() {
		return doiTuong;
	}

	public void setDoiTuong(String doiTuong) {
		if (checkDoiTuong(doiTuong) == true) {
			this.doiTuong = doiTuong;
		}
		else {
			this.doiTuong = "";
		}
	}

	public int getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	
}
