package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ordem da matriz: ");
		int n  = sc.nextInt();
		
		int [][] matrix = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<n; i++) {
			System.out.println();
			for (int j = 0; j<n; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		System.out.println("Main Diagonal:");
		for(int i = 0;i<n;i++) {
			System.out.println(matrix[i][i] + " ");
		}
		
		
		sc.close();
	}

}
