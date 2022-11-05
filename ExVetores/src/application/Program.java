package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);

		System.out.print("Quantos itens terá o vetor? ");
		int n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for(int i = 0; i<n ; i++) {
			vect[i] =  sc.nextInt();
		}
		
		for(int i = 0; i<n ; i++) {
			System.out.println(vect[i]);
		}
	}

}
