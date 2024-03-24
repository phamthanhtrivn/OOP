package bai08;

public abstract class HangHoa {
	private String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	
	public abstract String mucDoBuonBan();
	public abstract double VAT();
	
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) throws Exception {
		if (!maHang.trim().equals("")) {
			this.maHang = maHang;
		}
		else throw new Exception("Ma hang khong duoc phep rong!\n");
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	
	@Override
	public String toString() {
		return "=======================================\n" + 
				"Ma Hang: " + this.maHang + "\n" + 
				"Ten Hang: " + this.tenHang + "\n" + 
				"Don Gia: " + String.format("%.2f", this.donGia) + "\n" +
				"So Luong Ton: " + this.soLuongTon;
	}



	public String getMaHang() {
		return maHang;
	}


	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(!tenHang.trim().equals("")) {
			this.tenHang = tenHang;
		}
		else {
			this.tenHang = "xxx";
		}
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		}
		else 
			this.donGia = 0;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		if (soLuongTon >= 0) {
			this.soLuongTon = soLuongTon;
		}
		else this.soLuongTon = 0;
	}
	
	
	
}
