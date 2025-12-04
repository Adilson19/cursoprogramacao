package application;
import model.exceptions.idadeInvalidaError;
import java.util.Scanner;
import model.entities.Validation;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		Validation validation = new Validation(idade);
		try {
			validation.validarIdade(idade);
			validation.validarIdade(25);
			validation.validarIdade(50);
			validation.validarIdade(200);
		}
		catch(idadeInvalidaError e) {
			System.out.println("Erro Capturado: " + e.getMessage());
		}
		sc.close();
	}
}
