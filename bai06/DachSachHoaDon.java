package bai06;

public class DachSachHoaDon {
	private HoaDon[] danhSach;
	private int count;
	
	public DachSachHoaDon(int n) {
		this.danhSach = new HoaDon[n];
		this.count = 0;
	}
	
	public boolean them(HoaDon hd) {
		for (int i = 0; i < this.count; i++) {
			if (danhSach[i].getMaHoaDon().equals(hd.getMaHoaDon())) 
				return false;
		}
		danhSach[count++] = hd;
		return true;
	}
	
	public String toString() {
		String s = "";
		if (this.count == 0) {
			System.out.println("Danh sach rong!");;
		}
		s += "Danh Sach Hoa Don\n";
		for (int i = 0; i < this.count; i++) {
			s += danhSach[i].toString() + "\n";
		}
		return s;
	}
	
	public int thongKeSoLuongHDTheoGio() {
		int cnt = 0;
		for (int i = 0; i < this.count; i++) {
			if (danhSach[i] instanceof HoaDonTheoGio) {
				++cnt;
			}
		}
		return cnt;
	}
	
	public int thongKeSoLuongHDTheoNgay() {
		int cnt = 0;
		for (int i = 0; i < this.count; i++) {
			if (danhSach[i] instanceof HoaDonTheoNgay) {
				++cnt;
			}
		}
		return cnt;
	}
	
	public double tinhTongThanhTien(int thang, int nam) {
		double sum = 0;
		for (int i = 0; i < this.count; i++) {
			if (danhSach[i].getNgayHoaDon().getMonthValue() == thang && danhSach[i].getNgayHoaDon().getYear() == nam) {
				if (danhSach[i] instanceof HoaDonTheoGio) {
					sum += ((HoaDonTheoGio)danhSach[i]).thanhTien();
				}
				else {
					sum += ((HoaDonTheoNgay)danhSach[i]).thanhTien();
				}
			}
		}
		return sum;
	}

	public HoaDon[] getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(HoaDon[] danhSach) {
		this.danhSach = danhSach;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
