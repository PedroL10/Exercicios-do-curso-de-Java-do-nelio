package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent rooms[] = new Rent[10];
		
		System.out.println("How many rooms will be rented?");
		int numberRents = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<numberRents; i++) {
			System.out.println("Rent #"+ (i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			rooms[room] = new Rent(name, email);	
			
			
	}
		System.out.println("Busy rooms: ");
		for (int i = 0; i<10; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}

}
}