package bai09;

public class Customer extends Person{
	private String tenCongTy;
	private double triGiaHoaDon;
	private String danhGia;
	
	public String toString() {
		return super.toString() + "\n" + 
				"Ten cong ty: " + this.tenCongTy + "\n" +
				"Tri gia hoa don: " + String.format("%.2f\n", this.triGiaHoaDon) + 
				"Danh gia: " + this.danhGia;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon, String danhGia) {
		super(hoTen, diaChi);
		this.tenCongTy = tenCongTy;
		this.triGiaHoaDon = triGiaHoaDon;
		this.danhGia = danhGia;
	}
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public double getTriGiaHoaDon() {
		return triGiaHoaDon;
	}
	public void setTriGiaHoaDon(double triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}
	public String getDanhGia() {
		return danhGia;
	}
	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

}
