package src;

import java.util.Scanner;
/*
 * 3- Contagem de Pares e Ímpares: 
 * Leia um vetor de 15 números inteiros. 
 * Conte e imprima quantos números são pares e quantos são ímpares no vetor.
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 15;
		int[] vect = new int[n];
		System.out.println("Digite 15 numeros inteiros: ");
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		int contPares = 0;
		int contImpares = 0;
		for(int i = 0; i < n; i++) {
			int numero = vect[i];
			if(numero % 2 == 0){
				contPares++;
			}else{
				contImpares++;
			}
		}
		
		System.out.println("\n--- Resultado da Contagem ---");
        System.out.println("Total de números lidos: " + n);
        System.out.println("Quantidade de números PARES: " + contPares);
        System.out.println("Quantidade de números ÍMPARES: " + contImpares);
		
		sc.close();
	}
}
