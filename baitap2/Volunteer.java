package baitap2;

public class Volunteer extends StaffMember{
	
	public Volunteer(String name, String address, String phone) {
		super(name, address, phone);
	}
	@Override
	public double pay() {
		return 0;
	}
}
