package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//	Studying about Abstracts Class
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		
		for(Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		/*
		Account acc =  new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		*/
		//	UPCASTING - Pegar um objecto de uma Subclasse e atribuir o valor para uma Superclasse
		
		//Account acc1 = bacc;
		//acc1.getBalance();
		/*
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		*/
		//	DOWNCASTING - Converter um objecto da Suoerclasse para a Subclasse ou seja o processo inverso
		/*
		BusinessAccount acc4 = (BusinessAccount) acc2;//	Nao posso converter de Account (Supeclasse) para BusinessAccount (Subclasse) - Para tal devo fazer o CASTING (A classe que quero converter)
		acc4.loan(100.0);
		*/
		//	Evitando esse tipo de erro	
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		//	acc3 nao eh instancia de BusinessAccount
		/*if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}*/
		//	acc3 eh uma instancia de BusinessAccount
		/*if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}*/
		
		// Sobreposicao
		/*Account acc6 = new Account(1005, "Bruno", 13000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1006, "Guimaraes", 10000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.print(acc7.getBalance());		
		
		Account acc8 = new BusinessAccount(1003, "Jandira", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());*/
	}

}
