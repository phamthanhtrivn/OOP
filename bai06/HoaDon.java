package bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String hoTen;
	private String maPhong;
	private double donGia;
	
	public abstract double thanhTien();
	
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "==========================================\n" + 
				"Ma Hoa Don: " + this.maHoaDon + "\n" + 
				"Ngay Hoa Don: " + df.format(this.ngayHoaDon) + "\n" + 
				"Ho Ten: " + this.hoTen + "\n" + 
				"Ma Phong: " + this.maPhong + "\n" +
				"Don Gia: " + String.format("%.2f", this.donGia);
	}
	
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String hoTen, String maPhong, double donGia) {
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.hoTen = hoTen;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}

	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	
}
