package bai01;

public class XeNoiThanh extends Xe{
	private String soTuyen;
	private int soKMDiDuoc;
	
	public XeNoiThanh() {
		// TODO Auto-generated constructor stub
	}
	

	public XeNoiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, String soTuyen, int soKMDiDuoc) {
		super(maSoChuyen, tenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKMDiDuoc = soKMDiDuoc;
	}


	public String getSoTuyen() {
		return soTuyen;
	}


	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}


	public int getSoKMDiDuoc() {
		return soKMDiDuoc;
	}


	public void setSoKMDiDuoc(int soKMDiDuoc) {
		this.soKMDiDuoc = soKMDiDuoc;
	}
	
	public String toString() {
		return super.toString() + String.format("%-10s %-10d", this.soTuyen, this.soKMDiDuoc);
	}
	
}
