package bai07;

public abstract class Employee {
	private String fName, lName;
	private String socialSecurityNumber;
	
	public Employee(String fName, String lName, String socialSecurityNumber) {
		this.fName = fName;
		this.lName = lName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() {
		return "======================================\n" + 
				"First Name: " + this.fName + "\n" + 
				"Last Name: " + this.lName + "\n" + 
				"Social Security Number: " + this.socialSecurityNumber;
	}
	
	public abstract double earnings();

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	
	
}
