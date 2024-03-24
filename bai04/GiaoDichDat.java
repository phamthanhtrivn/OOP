package bai04;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich{
	private String loaiDat;
	
	
	@Override
	public double thanhTien() {
		if (this.loaiDat.equals("A")) {
			return super.getDienTich() * super.getDonGia() * 1.5;
		}
		else {
			return super.getDienTich() * super.getDonGia();
		}
	}
	
	public String toString() {
		return super.toString() + 
				"Loai Dat: " + this.loaiDat + "\n" + 
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
	public GiaoDichDat() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		if (checkLoaiDat(loaiDat) == true) {
			this.loaiDat = loaiDat;
		}
		else {
			this.loaiDat = "";
		}
	}
	
	public boolean checkLoaiDat(String loaiDat) {
		if (loaiDat.equals("A") || loaiDat.equals("B") || loaiDat.equals("C")) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		if (loaiDat.equals("A") || loaiDat.equals("B") || loaiDat.equals("B")) {
			this.loaiDat = loaiDat;
		}
		else {
			this.loaiDat = "";
		}
	}
	
	
	
}
