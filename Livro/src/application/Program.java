package application;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Digite o titulo de um livro: ");
		String titulo = sc.nextLine();
		System.out.print("Digite o nome do autor: ");
		sc.next();
		String autor = sc.nextLine();
		System.out.print("Digite o numero de paginas do livro: ");
		int numeroPaginas = sc.nextInt();
		Livro livro = new Livro(titulo, autor, numeroPaginas);
		System.out.print(livro.mostrarDetalhes(titulo, autor, numeroPaginas));
		
		
		sc.close();
	}

}
