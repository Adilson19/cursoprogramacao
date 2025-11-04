package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date date = sc.nextDouble();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		System.out.print("How many items to this order? ");
		int n = sc.nextInt(); 
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter "+i+" item data: ");
			System.out.print("Product name: ");
			System.out.print("Produtct price: ");
			System.out.print("Quantity: "+i);			
		}
		
		
		sc.close();
	}

}
