package bai07;

public class HourLyEmployee extends Employee{
	private double wage;
	private double hours;
	
	@Override
	public double earnings() {
		if (this.hours <= 40) {
			return this.hours * this.wage; 
		}
		else {
			return 40 * this.wage + (this.hours - 40) * wage * 1.5;
		}
	}

	public HourLyEmployee(String fName, String lName, String socialSecurityNumber, double wage, double hours) {
		super(fName, lName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	
	public String toString() {
		return super.toString() + "\n" + 
				"Wage: " + String.format("%.2f", this.wage) + "\n" +
				"Hours: " + String.format("%.2f", this.hours);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
}
