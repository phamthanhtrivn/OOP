package bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Sach {
	private String maSach, nhaXB;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	
	public abstract double thanhTien();
	
	public Sach(String maSach, String nhaXB, LocalDate ngayNhap, double donGia, int soLuong) {
		this.maSach = maSach;
		this.nhaXB = nhaXB;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	public Sach() {
		// TODO Auto-generated constructor stub
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}

	public LocalDate getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
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
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "=======================================\n" + 
				"Ma Sach: " + this.maSach + "\n" +
				"Ngay Nhap: " + dtf.format(this.ngayNhap) + "\n" + 
				"Don Gia: " + String.format("%.2f", this.donGia) + "\n" + 
				"So Luong: " + this.soLuong + "\n" + 
				"Nha Xan Xuat: " + this.nhaXB + "\n";
	}
	
	
}
