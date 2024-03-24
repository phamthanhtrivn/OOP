package bai03;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class GiaoDich {
	private String maGD;
	private LocalDate ngayGD;
	private double donGia;
	private int soLuong;
	
	public abstract double thanhTien();
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "========================================" + "\n" + 
				"Ma Giao Dich: " + this.maGD + "\n" +
				"Ngay Giao Dich: " + dtf.format(this.ngayGD) + "\n" + 
				"Don Gia: " + String.format("%.2f", this.donGia) + "\n" +
				"So luong: " + this.soLuong;
	}
	
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(String maGD, LocalDate ngayGD, double donGia, int soLuong) {
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
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

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
