package bai05;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;
	
	@Override
	public double thanhTien() {
		return super.getSoKWTieuThu() * super.getDonGia();
	}
	
	public String toString() {
		return super.toString() + "\n" +
				"Quoc Tich: " + this.quocTich + "\n" + 
				"Thanh Tien: " + String.format("%.2f", thanhTien());
	}
	
	public KhachHangNuocNgoai() {
		// TODO Auto-generated constructor stub
	}

	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, int soKWTieuThu,
			double donGia, String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKWTieuThu, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	
	
}
