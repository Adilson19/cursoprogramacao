package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc =  new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//	UPCASTING - Pegar um objecto de uma Subclasse e atribuir o valor para uma Superclasse
		
		Account acc1 = bacc;
		//acc1.getBalance();
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//	DOWNCASTING - Converter um objecto da Suoerclasse para a Subclasse ou seja o processo inverso
		
		BusinessAccount acc4 = (BusinessAccount) acc2;//	Nao posso converter de Account (Supeclasse) para BusinessAccount (Subclasse) - Para tal devo fazer o CASTING (A classe que quero converter)
		acc4.loan(100.0);
		
		//	Evitando esse tipo de erro	
		//BusinessAccount acc5 = (BusinessAccount) acc3;
		//	acc3 nao eh instancia de BusinessAccount
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		//	acc3 eh uma instancia de BusinessAccount
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
	}

}
