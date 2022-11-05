package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>(); // Lista nao aceita tipos primitivos
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Employee #"+ (i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}

		System.out.print("Enter the employee id that will have salary increase");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		for(Employee emp : list) {
			if(emp.getId() == id) {
				emp.IncreaseSalary(percentage);
			}
		}
		
		for(Employee emp : list ) {
			System.out.println(emp);
		}
		
	}

}
