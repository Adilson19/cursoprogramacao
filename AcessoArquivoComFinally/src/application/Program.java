package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Execucao 1: Arquivo Nao Encontrado ---");
		openningFile.tryingOpenFile("arquivo_inexistente.txt");
		
		System.out.println("\n"+"-".repeat(50)+"\n");
		
		System.out.println("--- Execucao 2: Sucesso (Assumindo que 'dados.txt' existe) ---");
		openningFile.tryingOpenFile("dados.txt");
		
		sc.close();
	}

}
