package bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;
	
	public String toString() {
		return super.toString() + "\n" +
				"Loai Vang: " + this.loaiVang + "\n" + 
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
	@Override
	public double thanhTien() {
		return super.getSoLuong() * super.getDonGia();
	}
	
	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	
}
