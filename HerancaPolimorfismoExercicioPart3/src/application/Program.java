package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List <Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Anual Income: ");
				double rendaAnual = sc.nextDouble();				
				System.out.print("Health expenditures: ");
				sc.nextLine();
				double gastosComSaude = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
				
			}else if(ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Anual Income: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numeroDeFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
				
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(Pessoa pessoa : list) {
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.pagarImposto()));
		}
		
		System.out.println();
		
		System.out.println("TOTAL TAXES: $ ");
		double soma = 0.0;
		for(Pessoa pessoa : list) {
			soma += pessoa.pagarImposto();
		}
		System.out.println(String.format("%.2f", soma));
		
		sc.close();
	}

}
