package bai07;

public class BasePlusCommissonEmployee extends CommissionEmployee{
	private double baseSalary;

	public BasePlusCommissonEmployee(String fName, String lName, String socialSecurityNumber, double grossSales,
			double commissonRate, double baseSalary) {
		super(fName, lName, socialSecurityNumber, grossSales, commissonRate);
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return super.earnings() + this.baseSalary;
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Base Salary: " + String.format("%.2f", this.baseSalary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
}
