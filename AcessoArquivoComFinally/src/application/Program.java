package application;

import java.util.Scanner;
import model.exceptions.TryingOpenFile;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do ficheiro: ");
		String name = sc.nextLine();
		TryingOpenFile openningFile = new TryingOpenFile(name);
		System.out.println("--- Execucao 1: Arquivo Nao Encontrado ---");
		openningFile.tryingOpenFileException(name);		
		System.out.println("\n"+"-".repeat(50)+"\n");
		System.out.println("--- Execucao 2: Sucesso (Assumindo que 'dados.txt' existe) ---");
		openningFile.tryingOpenFileException(name);
		
		sc.close();
	}
}