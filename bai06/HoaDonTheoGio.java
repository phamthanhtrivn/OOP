package bai06;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon{
	private int soGioThue;
	
	@Override
	public double thanhTien() {
		return this.soGioThue * super.getDonGia();
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"So Gio Thue: " + this.soGioThue + "\n" + 
				"Don Gia: " + String.format("%.2f", thanhTien());
	}
	
	public HoaDonTheoGio() {
		// TODO Auto-generated constructor stub
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String hoTen, String maPhong, double donGia, int soGioThue) throws Exception {
		super(maHoaDon, ngayHoaDon, hoTen, maPhong, donGia);
		checkSoGioThue(soGioThue);
	}
	
	public void checkSoGioThue(int soGioThue) throws Exception {
		if (soGioThue > 0 && soGioThue <= 24) {
			this.soGioThue = soGioThue;
		}
		else if (soGioThue <= 30) {
			this.soGioThue = 24;
		}
		else {
			throw new Exception("So gio khong hop le!\n");
		}
	}

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) throws Exception {
		checkSoGioThue(soGioThue);
	}
	
	
}
