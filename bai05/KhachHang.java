package bai05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class KhachHang {
	private String maKhachHang, hoTen;
	private LocalDate ngayLapHoaDon;
	private int soKWTieuThu;
	private double donGia;
	
	public abstract double thanhTien();
	
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "=================================================\n" + 
				"Ma Khach Hang: " + this.maKhachHang + "\n" +
				"Ho Ten: " + this.hoTen + "\n" + 
				"Ngay Lap Hoa Don: " + df.format(this.ngayLapHoaDon) + "\n" + 
				"So KW Tieu Thu: " + this.soKWTieuThu + "\n" +
				"Don Gia: " + String.format("%.2f", this.donGia);
	}
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, int soKWTieuThu, double donGia) {
		super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKWTieuThu = soKWTieuThu;
		this.donGia = donGia;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	public int getSoKWTieuThu() {
		return soKWTieuThu;
	}

	public void setSoKWTieuThu(int soKWTieuThu) {
		this.soKWTieuThu = soKWTieuThu;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	
}
