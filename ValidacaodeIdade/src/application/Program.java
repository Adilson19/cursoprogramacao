package application;

import model.exceptions.idadeInvalidaError;

public class Program {
	
	
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
