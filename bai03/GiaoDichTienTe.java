package bai03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private String loaiTienTe;
	
	@Override
	public double thanhTien() {
		if (this.loaiTienTe.equals("VN")) {
			return super.getSoLuong() * super.getDonGia();
		}
		else if (this.loaiTienTe.equals("USA") || this.loaiTienTe.equals("Euro")){
			return super.getSoLuong() * super.getDonGia() * this.tiGia;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Ti Gia: " + String.format("%.2f", this.tiGia) + "\n" + 
				"Loai Tien Te: " + this.loaiTienTe + "\n" + 
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
	public GiaoDichTienTe() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichTienTe(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia, String loaiTienTe) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = tiGia;
		if (checkTienTe(loaiTienTe) == true) {
			this.loaiTienTe = loaiTienTe;
		}
	}
	
	public boolean checkTienTe(String loaiTienTe) {
		if (loaiTienTe.equals("VN") || loaiTienTe.equals("USA") || loaiTienTe.equals("Euro"))
			return true;
		return false;
	}

	public double getTiGia() {
		return tiGia;
	}

	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	public String getLoaiTienTe() {
		return loaiTienTe;
	}

	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	
	
}
