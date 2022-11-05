package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
import entities.Employee;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exercicio 1
		System.out.print("Enter rectangle width and height: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();		
		
		Rectangle r1 = new Rectangle(height, width);
		
		System.out.println(String.format("%.2f", r1.area()));
		System.out.println(String.format("%.2f", r1.perimeter()));
		System.out.println(String.format("%.2f", r1.diagonal()));
		
		*/
		/*Exercicio 2
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee e1 = new Employee(name, grossSalary, tax);
		
		System.out.println("Employee: " + e1.getName() +", $: " + e1.netSalary());
		
		System.out.print("Wich percentage to incresa salary: ");
		double percentage = sc.nextDouble();
		
		e1.increaseSalary(percentage);
		
		System.out.print("Updated data: " + e1.getName() + ", $: " + e1.netSalary());
		*/
		
		System.out.print("Nome do aluno: ");
		String name= sc.nextLine();
		System.out.print("Nota 1: ");
		double nota1= sc.nextDouble();
		System.out.print("Nota 2: ");
		double nota2= sc.nextDouble();
		System.out.print("Nota 3: ");
		double nota3= sc.nextDouble();
		
		Aluno a1 = new Aluno(name, nota1, nota2, nota3);
		
		System.out.println("Final Grade: " + a1.notaFinal());
		System.out.println(a1.aprovado());
		
	}

}
