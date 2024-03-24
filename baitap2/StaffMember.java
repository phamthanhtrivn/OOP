package baitap2;

public abstract class StaffMember {
	protected String name, address, phone;

	public StaffMember(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "StaffMember [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	public abstract double pay();
}
