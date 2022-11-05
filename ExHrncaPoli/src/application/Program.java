package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i =1; i<=N;i++) {
			System.out.println("Tax Payer #" + i + " data:");			
			System.out.print("Individual or Company? (i/c)");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual Income: ");
			Double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health Expenditures: ");
				Double he = sc.nextDouble();
				Individual x = new Individual(name, anualIncome, he);
				list.add(x);				
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				Company y = new Company(name, anualIncome, numberOfEmployees);				
				list.add(y);
			}
		}
		
		System.out.println();
		System.out.println("Taxes Paid");
		for (TaxPayer tp: list ) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		
		System.out.println("TOTAL TAXES : " + String.format("%.2f", sum));

	}

}
