package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there a initial deposit? (y/n)");
		char resp = sc.next().charAt(0);
		
		if (resp == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, name, 0, initialDeposit);
			acc.deposit(initialDeposit);			
		} else {
			acc = new Account(number, name, 0);
		}
		
		System.out.println("Account data: ");
		System.out.print("Account "+ acc.getNumber()+ ", Holder: "+acc.getName() +", Balance: " + acc.getBalance());
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		System.out.println("Updated Account data: ");
		System.out.println("Account "+ acc.getNumber()+ ", Holder: "+acc.getName() +", Balance: " + acc.getBalance());
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		System.out.println("Updated Account data: ");
		System.out.print("Account "+ acc.getNumber()+ ", Holder: "+acc.getName() +", Balance: " + acc.getBalance());
		
	}

}
