package bai01;

public class XeNgoaiThanh extends Xe {
	private String noiDen;
	private int soNgayDiDuoc;
	
	public XeNgoaiThanh() {
		// TODO Auto-generated constructor stub
	}

	public XeNgoaiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
		super(maSoChuyen, tenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public String toString() {
		return super.toString() + String.format("%-10s %-10d", this.noiDen, this.soNgayDiDuoc);
	}
}
