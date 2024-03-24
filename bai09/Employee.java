package bai09;

public class Employee extends Person{
	private double heSoLuong;
	
	public String toString() {
		return super.toString() + "\n" + 
				"He so luong: " + String.format("%.2f\n", this.heSoLuong) + 
				"Luong: " + String.format("%.2f", tinhLuong());
	}
	
	public double tinhLuong() {
		return this.heSoLuong * 3000000;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String hoTen, String diaChi, double heSoLuong) {
		super(hoTen, diaChi);
		this.heSoLuong = heSoLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
}
