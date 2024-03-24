package bai09;

public class Person {
	private String hoTen, diaChi;
	
	public String toString() {
		return "=====================================\n" +
				"Ho ten: " + this.hoTen + "\n" + 
				"Dia chi: " + this.diaChi + "\n";	
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String hoTen, String diaChi) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
	}



	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	
}	
