package src;

import java.util.Locale;
import entities.Funcionario;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ===================================================");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                   SEJA BEM-VINDO                  |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println("|                                                   |");
		System.out.println(" ===================================================");
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();		
		System.out.println("Quantas horas voce trabalhou: ");
		double qtHoras = sc.nextDouble();
		System.out.println("Quanto deseja receber por hora? ");
		double valorHora = sc.nextDouble();
		System.out.println("Qual eh o seu sexo? (M/F)");
		char sexo = sc.next().charAt(0);
		
		
		Funcionario funcionario = new Funcionario(idade, nome,sexo, qtHoras, valorHora);	
		System.out.println("Preencha os seus dados");
		funcionario = ;
		
		
		
		sc.close();
	}
}
