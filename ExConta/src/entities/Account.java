package entities;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	private double initialDeposit;
	
	
	public Account () {}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	} 
	
	public void withdraw(double amount) {
		balance -= (amount + 5);
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", balance=" + balance;
	} 
	
	
	
}
