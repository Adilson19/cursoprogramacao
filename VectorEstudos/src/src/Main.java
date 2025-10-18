package src;

import java.util.Scanner;
/* 
 * 1- Leitura e Impressão Inversa: Crie um programa que leia 10 números inteiros do usuário 
 * e os armazene em um vetor (ou lista). Ao final, imprima o vetor:

	a) Na ordem em que foi lido.

	b) Na ordem inversa (o último elemento primeiro).

 * 
 * 
 * */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int[] vect = new int [n];
		System.out.println("Digite por favor um numero");
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Ordem Crescente");
		System.out.println("-----------------------------------------------------------------------");
		for(int i=0; i<n; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Ordem Decrescente");
		System.out.println("-----------------------------------------------------------------------");
		for(int i = n-1; i >= 0; i--) {
			System.out.println(vect[i]);
		}
		
		sc.close();	}
}
