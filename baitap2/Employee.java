package baitap2;

public class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;

	public Employee(String name, String address, String phone, String socialSecurityNumber, double payRate) {
		super(name, address, phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}

	@Override
	public String toString() {
		return "Employee [socialSecurityNumber=" + socialSecurityNumber + ", payRate=" + payRate + "]";
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return payRate;
	}
	
	

}
