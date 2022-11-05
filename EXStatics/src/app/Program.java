package app;

import java.util.Locale;
import java.util.Scanner;

import util.Converter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought: ");
		double dollars = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais: " + Converter.converter(dollarPrice, dollars));
		

	}

}
