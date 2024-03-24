package bai07;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String fName, String lName, String socialSecurityNumber, double weeklySalary) {
		super(fName, lName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return this.weeklySalary;
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Weekly Salary: " + String.format("%.2f", this.weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
}
