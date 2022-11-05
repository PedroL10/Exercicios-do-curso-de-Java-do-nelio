package entities;

public class Account {

	private int number;
	private String name;
	private double balance;
	private double initialDeposit;
	
	public Account() {}

	public Account(int number, String name, double balance, double initialDeposit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.initialDeposit = initialDeposit;
	}

	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
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

	public double getBalance() {
		return balance;
	}

	public double getInitalDeposit() {
		return initialDeposit;
	}

	public void setInitalDeposit(double initalDeposit) {
		this.initialDeposit = initalDeposit;
	}
	
	public void deposit (double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5; 
	}
	
	
	
}
