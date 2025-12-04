//package model.entities;
package model.entities;

import model.exceptions.idadeInvalidaError;
public class Validation {
	private Integer idade; 

	public Validation(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}



	public void validarIdade(int idade) throws idadeInvalidaError {
		if(idade < 0 || idade > 150) {
			throw new idadeInvalidaError("A idade: " + idade + " nao eh permitida (limites: 0-150).");
		}
		System.out.println("Idade " + idade + " eh valido.");
	}

}
