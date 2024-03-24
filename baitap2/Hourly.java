package baitap2;

public class Hourly extends Employee{
	public Hourly(String name, String address, String phone, String socialSecurityNumber, double payRate) {
		super(name, address, phone, socialSecurityNumber, payRate);
		// TODO Auto-generated constructor stub
	}

	private int hoursWorked;
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay() + this.hoursWorked;
	}

	@Override
	public String toString() {
		return "Hourly [hoursWorked=" + hoursWorked + "]";
	}
	
	public void addHours(int hours) {
		this.hoursWorked = hours;
	}
}
