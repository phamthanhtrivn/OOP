package bai01;

public class Xe {
	private String maSoChuyen, tenTaiXe, soXe;
	private double doanhThu;
	
	public Xe() {
		// TODO Auto-generated constructor stub
	}

	public Xe(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	public String toString() {
		return String.format("%-10s %-20s %-10s %-10.2f ", this.maSoChuyen, this.tenTaiXe, this.soXe, this.doanhThu);
	}
	
	
}
