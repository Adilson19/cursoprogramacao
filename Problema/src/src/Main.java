package src;

import java.util.Scanner;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//	Variaveis temporarias
		System.out.println("Digite o nome do Produto");
		String name = sc.nextLine();
		System.out.println("Digite o preco do Produto");
		Double price = sc.nextDouble();
		System.out.println("Digite a quantidade do Produto");
		Integer quantity = sc.nextInt();
		
		
		
		sc.close();

	}

}
