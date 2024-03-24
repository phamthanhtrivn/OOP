package bai08;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachBanHang {
	private HangHoa[] list;
	private int count;
	
	public DanhSachBanHang(int n) {
		list = new HangHoa[n];
		count = 0;
	}
	
	public void them(HangHoa hh) throws Exception { 
		HangHoa tmp = timKiem(hh.getMaHang());
		if (tmp == null) 
			list[count++] = hh;
		else throw new Exception("Khong the them vi trung ma hang!\n");
	}
	
	public String xuatDanhSach() { 
		String s = "";
		System.out.println("--Thong tin toan bo danh sach cac hang hoa--");
		for (int i = 0; i < this.count; i++) {
			s += list[i].toString() + "\n";
		}
		return s;
	}
	
	public String xuatHangThucPham() {
		String s = "";
		for (int i = 0; i < this.count; i++) {
			if (list[i] instanceof HangThucPham) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}
	
	public String xuatHangDienMay() {
		String s = "";
		for (int i = 0; i < this.count; i++) {
			if (list[i] instanceof HangDienMay) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}
	
	public String xuatHangSanhSu() {
		String s = "";
		for (int i = 0; i < this.count; i++) {
			if (list[i] instanceof HangSanhSu) {
				s += list[i].toString() + "\n";
			}
		}
		return s;
	}
	
	public HangHoa timKiem(String ma) {
		for (int i = 0; i < this.count; i++) {
			if (list[i].getMaHang().equals(ma)) {
				return list[i];
			}
		}
		return null;
	}
	
	
	public void sapXepHHTheoTenTangDan() {
		Arrays.sort(list, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getMaHang().compareToIgnoreCase(o2.getMaHang()) > 0) {
					return 1;
				}
				else if (o1.getMaHang().compareToIgnoreCase(o2.getMaHang()) < 0) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
	}
	
	public void sapXepHHTheoSLTGiamDan() {
		Arrays.sort(list, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getSoLuongTon() > o2.getSoLuongTon()) {
					return -1;
				}
				else if (o1.getSoLuongTon() < o2.getSoLuongTon()){
					return 1;
				}
				else 
					return 0;
			}
		});
	}
	
	public String hangTPKhoBan() {
		String s = "";
		for (int i = 0; i < this.count; i++) {
			if (list[i] instanceof HangThucPham) {
				if (list[i].mucDoBuonBan().equalsIgnoreCase("kho ban")) {
					s += list[i].toString() + "\n";
				}
			}
		}
		return s;
	}
	
	public boolean xoaHHTheoMa(String ma) {
		HangHoa hh = timKiem(ma);
		if (hh == null) 
			return false;
		HangHoa[] tmp = new HangHoa[this.count - 1];
		int j = 0;
		for (int i = 0; i < this.count; i++) {
			if (!list[i].getMaHang().equalsIgnoreCase(ma)) {
				tmp[j++] = list[i];
			}
		}
		list = tmp;
		this.count--;
		return true;
	}
	
	public boolean suaDonGia(String ma, double gia) {
		HangHoa hh = timKiem(ma);
		if (hh == null)
			return false;
		else {
			hh.setDonGia(gia);
			return true;
		}
			
		
	}
	
}
