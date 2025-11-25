package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		System.out.print("Holder: ");
		System.out.print("Initial balance: ");
		System.out.print("Withdraw limit: ");
		
		System.out.print("Enter amount for withdraw: ");
		System.out.print("New balance: ");
		
		sc.close();
	}

}
