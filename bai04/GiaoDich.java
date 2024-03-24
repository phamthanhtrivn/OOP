package bai04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private double dienTich;
	
	public abstract double thanhTien();
	
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "===========================\n" +
				"Ma Giao Dich: " + this.maGD + "\n" +
				"Ngay Giao Dich: " + df.format(this.ngayGD) + "\n" +
				"Don Gia: " + String.format("%.2f", this.donGia) + "\n" +
				"Dien tich: " + String.format("%.2f m2\n", this.dienTich);  
	}
	
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, double dienTich) {
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	public String getMaGD() {
		return maGD;
	}

	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public LocalDate getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	
	
}
