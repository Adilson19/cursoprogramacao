package application;

import model.exceptions.idadeInvalidaError;

public class Program {
	public static void validarIdade(int idade) throws idadeInvalidaError{
		if(idade < 0 || idade > 150) {
			throw new idadeInvalidaError("A idade: " + idade + " nao eh permitida (limites: 0-150).");
		}
		System.out.println("Idade " + idade + " eh valido.");
	}
	
	public static void main(String[] args) {
		try {			
			validarIdade(25);
			validarIdade(50);
			validarIdade(200);
		}
		catch(idadeInvalidaError e) {
			System.out.println("Erro Capturado: " + e.getMessage());
		}
	}

}
