package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Account acc;
		
		System.out.print("Informe o numero da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o nome do titular da conta: ");
		String nome = sc.nextLine();
		
		System.out.print("Fará um depósito inicial? (S/N)");
		char resp = sc.next().charAt(0);
		
		if (resp == 'S') {
			System.out.print("Valor do deposito: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(conta, nome, initialDeposit);			
		} else {
			acc = new Account(conta, nome);
		}
		
		acc.deposit(1000);
		acc.withdraw(500);
		
		System.out.println( acc.toString());

	}

}
