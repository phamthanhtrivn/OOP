package bai08;

public class HangDienMay extends HangHoa{
	private int thoiGianBaoHanh;
	private int congSuat;
	
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh, int congSuat) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBaoHanh(thoiGianBaoHanh);
		setCongSuat(congSuat);
	}
	
	@Override
	public String mucDoBuonBan() {
		if (super.getSoLuongTon() < 3) {
			return "Ban Duoc";
		}
		else {
			return "Khong Danh Gia";
		}
	}
	
	@Override
	public double VAT() {
		// TODO Auto-generated method stub
		return 0.1 * super.getDonGia();
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n" + 
				"Thoi Gian Bao Hanh: " + this.thoiGianBaoHanh + "\n" + 
				"Cong Suat: " + this.congSuat + " KW";
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		if (thoiGianBaoHanh >= 0) {
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		}
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		if (congSuat >= 0) {
			this.congSuat = congSuat;
		}
	}
	
	
	
	
}
