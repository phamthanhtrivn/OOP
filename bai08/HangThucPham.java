package bai08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa{
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	@Override
	public String toString() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + "\n" + 
				"Nha Cung Cap: " + this.nhaCungCap + "\n" + 
				"Ngay San Xuat: " + df.format(this.ngaySanXuat) + "\n" + 
				"Ngay Het Hang: " + df.format(this.ngayHetHan);
	}
	
	@Override
	public String mucDoBuonBan() {
		if (super.getSoLuongTon() > 0 && this.ngayHetHan.isBefore(LocalDate.now())) {
			return "Kho Ban";
		}
		else {
			return "Khong Danh Gia";
		}
	}
	
	@Override
	public double VAT() {
		// TODO Auto-generated method stub
		return 0.05 * super.getDonGia();
	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		}
		else {
			this.ngaySanXuat = LocalDate.now();
		}
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(this.ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		}
		else {
			this.ngayHetHan = this.ngaySanXuat;
		}
	}
	
	
}
