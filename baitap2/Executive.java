package baitap2;

public class Executive extends Employee{
	

	private double bonus;
	
	public Executive(String name, String address, String phone, String socialSecurityNumber, double payRate) {
		super(name, address, phone, socialSecurityNumber, payRate);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay() + bonus;
	}
	
	public void awardBonus(double bonus) {
		this.bonus = bonus;
	}
}
