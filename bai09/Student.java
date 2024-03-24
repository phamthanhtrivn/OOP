package bai09;

public class Student extends Person{
	private double diem1, diem2;
	
	
	public String toString() {
		return super.toString() + "\n" +
				"Diem mon hoc 1: " + String.format("%.2f\n", this.diem1) +
				"Diem mon hoc 2: " + String.format("%.2f\n", this.diem2) + 
				"Diem Trung Binh: " + String.format("%.2f", dTB());
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String hoTen, String diaChi, double diem1, double diem2) {
		super(hoTen, diaChi);
		this.diem1 = diem1;
		this.diem2 = diem2;
	}

	public String danhGia() {
		if (dTB() >= 8.0) {
			return "Gioi";
		}
		else if (dTB() >= 6.5) {
			return "Kha";
		}
		else if (dTB() >= 5.0) {
			return "Trung Binh";
		}
		else {
			return "Yeu";
		}
	}
	
	public double dTB() {
		return (this.diem1 + this.diem2) / 2;
	}

	public double getDiem1() {
		return diem1;
	}

	public void setDiem1(double diem1) {
		this.diem1 = diem1;
	}

	public double getDiem2() {
		return diem2;
	}

	public void setDiem2(double diem2) {
		this.diem2 = diem2;
	}
	
	
}
