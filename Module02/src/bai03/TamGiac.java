package bai03;

public class TamGiac {
	private int ma, mb, mc;
	
	public TamGiac() {
		// TODO Auto-generated constructor stub
	}
	
	public TamGiac(int ma, int mb, int mc) {
		if (ma < 0) {
			this.ma = 0;
		}
		else {
			this.ma = ma;
		}
		if (mb < 0) {
			this.mb = 0;
		}
		else {
			this.mb = mb;
		}
		if (mc < 0) {
			this.mc = 0;
		}
		else {
			this.mc = mc;
		}
		if (checkTamGiac(ma, mb, mc)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
		else {
			this.ma = this.mb = this.mc = 0;
		}
	}
	
	public boolean checkTamGiac(int ma, int mb, int mc) {
		if (ma + mb < mc || ma + mc < mb || mb + mc < ma) 
			return false;
		return true;
	}
	
	public void setMA(int a) {
		if (a > 0 && checkTamGiac(a, this.mb, this.mc)) {
			this.ma = a;
		}
		else {
			this.ma = 0;
		}
	}
	
	public void setMB(int b) {
		if (b > 0 && checkTamGiac(this.ma, b, this.mc)) {
			this.mb = b;
		}
		else {
			this.mb = 0;
		}
	}
	
	public void setMC(int c) {
		if (c > 0 && checkTamGiac(this.ma, this.mb, c)) {
			this.mc = c;
		}
		else {
			this.mc = 0;
		}
	}
	
	public int getMA() {
		return this.ma;
	}
	
	public int getMB() {
		return this.mb;
	}
	
	public int getMC() {
		return this.mc;
	}
	
	public int getChuVi() {
		return this.ma + this.mb + this.mc;
	}
	
	public double getDienTich() {
		double p = (double)getChuVi() / 2;
		return Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc));
	}
	
	public String kiemTra() {
		if (checkTamGiac(this.ma, this.mb, this.mc) == false) {
			return "Khong phai tam giac";
		}
		else {
			if (this.ma == this.mb && this.mb == this.mc) {
				return "Tam giac Deu";
			}
			else if (this.ma == this.mb || this.mb == this.mc || this.mc == this.ma) {
				return "Tam giac Can";
			}
			else {
				return "Tam giac Thuong";
			}
		}
	}
	
	
	public String toString() {
		return 	"============================================\n"
				+ "Canh a: " + this.ma + ", Canh b: " + this.mb + ", Canh c: " + this.mc + "\n"
				+ "Kieu tam giac: " + kiemTra() +  "\n"
				+ "Chu vi: " + getChuVi() + " cm\n"
				+ "Dien tich: " + String.format("%.2f", getDienTich()) + " cm";
	}
}
