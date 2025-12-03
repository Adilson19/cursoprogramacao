//package model.entities;
import model.exceptions.idadeInvalidaError;

public void ValidadorDeIdade(int idade) throws idadeInvalidaError {
	if(idade < 0 || idade > 150) {
		throw new idadeInvalidaError("A idade: " + idade + " nao eh permitida (limites: 0-150).");
	}
	System.out.println("Idade " + idade + " eh valido.");
}
