package bai01;

public class ToaDo {
	private double toaDoX, toaDoY;
	private String tenToaDo;
	
	public ToaDo() {
		// TODO Auto-generated constructor stub
	}
	
	public ToaDo(String tenToaDo, double toaDoX, double toaDoY) {
		this.tenToaDo = tenToaDo;
		this.toaDoX = toaDoX;
		this.toaDoY = toaDoY;
	}
	
	public void setTenToaDo(String ten) {
		this.tenToaDo = ten;
	}
	
	public void setToaDoX(double x) {
		this.toaDoX = x;
	}
	
	public void setToaDoY(double y) {
		this.toaDoY = y;
	}
	
	public String getTenToaDo() {
		return this.tenToaDo;
	}
	
	public double getToaDoX() {
		return this.toaDoX;
	}
	
	public double getToaDoY() {
		return this.toaDoY;
	}
	
	public String toString() {
		return this.tenToaDo + "(" + this.toaDoX + "," + this.toaDoY + ")";
	}
}
