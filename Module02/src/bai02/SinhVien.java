package bai02;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT, diemTH;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}
	
	public void setMaSV(int ma) {
		if (ma > 0) {
			this.maSV = ma;
		}
	}
	
	public void setHoTen(String hoTen) {
		if (!hoTen.trim().equals("")) {
			this.hoTen = hoTen;
		}
	}
	
	public void setDiemLT(double diem) {
		if (diem >= 0.0 && diem <= 10.0) {
			this.diemLT = diem;
		}
	}
	
	public void setDiemTH(double diem) {
		if (diem >= 0.0 && diem <= 10.0) {
			this.diemTH = diem;
		}
	}
	
	public int getMaSV() {
		return this.maSV;
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public double getDiemLT() {
		return this.diemLT;
	}
	
	public double getDiemTH() {
		return this.diemTH;
	}
	
	public double getDTB() {
		return (getDiemLT() + getDiemTH()) / 2; 
	}
	
	public String toString() {
		return String.format("%-10d %-30s %10.2f %10.2f %10.2f", 
				this.maSV, this.hoTen, this.diemLT, this.diemTH, getDTB());
	}
}
