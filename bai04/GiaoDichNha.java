package bai04;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich{
	private String diaChi;
	private String loaiNha;
	
	public GiaoDichNha() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double thanhTien() {
		if (this.loaiNha.equals("cao cap")) {
			return super.getDienTich() * super.getDonGia();
		}
		else {
			return super.getDienTich() * super.getDonGia() * 0.9;
		}
	}

	public GiaoDichNha(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		if (check(loaiNha)) {
			this.loaiNha = loaiNha;
		}
		this.diaChi = diaChi;
	}
	
	public boolean check(String loaiNha) {
		if (loaiNha.equals("thuong") || loaiNha.equals("cao cap"))
			return true;
		return false;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
	
}
