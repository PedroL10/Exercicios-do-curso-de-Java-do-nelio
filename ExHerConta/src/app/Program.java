package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);
		Account acc10 = new Account(1010, "Pedro", 1000.0);
		Account acc20 = new SavingAccount(999, "Loretinha", 1000.00, 5.0);
		Account acc30 = new BusinessAccount(3030, "Laika", 1000.0, 500.0);
		
		
		acc30.withdraw(200);
		acc20.withdraw(200);
		acc10.withdraw(200);
		System.out.println(acc10.getBalance());
		System.out.println(acc20.getBalance());
		System.out.println(acc30.getBalance());
		
		//UPCASTING		
		Account acc1 = bacc;		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		} 
		
		
	}

}
