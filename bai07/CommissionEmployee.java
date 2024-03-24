package bai07;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissonRate;
	public CommissionEmployee(String fName, String lName, String socialSecurityNumber, double grossSales, double commissonRate) {
		super(fName, lName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissonRate = commissonRate;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return this.commissonRate * this.grossSales;
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Gross Sales: " + String.format("%.2f", this.grossSales) + "\n" +
				"Commisson Rate: " + String.format("%.2f", this.commissonRate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissonRate() {
		return commissonRate;
	}

	public void setCommissonRate(double commissonRate) {
		this.commissonRate = commissonRate;
	}
	
	
}
