package bai13;

public class Account {
	private double balance;
	private String acc_id;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double balance, String acc_id) {
		super();
		this.balance = balance;
		this.acc_id = acc_id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	

}
