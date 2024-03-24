package bai08;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.toString() + "\n" +
				"Nha San Xuat: " + this.nhaSanXuat + "\n" +
				"Ngay Nhap Kho: " + dtf.format(this.ngayNhapKho);
	}
	
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat, LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		setNgayNhapKho(ngayNhapKho);
	}
	
	@Override
	public String mucDoBuonBan() {
		LocalDate homNay = LocalDate.now();
		Period intervalPeriod = Period.between(ngayNhapKho, homNay);
		int soNgay = intervalPeriod.getDays();
		return (super.getSoLuongTon() > 50 && soNgay > 10) ? "Ban Cham" : "Khong Danh Gia";
	}
	
	@Override
	public double VAT() {
		// TODO Auto-generated method stub
		return 0.1 * donGia;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isBefore(LocalDate.now())) {
			this.ngayNhapKho = ngayNhapKho;
		}
		else {
			this.ngayNhapKho = LocalDate.now();
		}
	}
	
	
}
