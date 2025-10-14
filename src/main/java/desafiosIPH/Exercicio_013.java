package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite um numero: ");
		a = sc.nextInt();
		System.out.println("Digite um outro numero: ");
		b = sc.nextInt();
		if(a > b) {
			System.out.printf("%d - %d%n", b, a);
		}else if(a < b) {
			System.out.printf("%d - %d%n", a, b);
		}else {
			System.out.println("Nao podem ser numeros iguais!");
		}
		
		sc.close();

	}

}
