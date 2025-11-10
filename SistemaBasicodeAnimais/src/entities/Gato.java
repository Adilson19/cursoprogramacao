package entities;

public class Gato extends Animal {
	public Gato() {
		
	}

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitrSom() {
		return getNome() + " mia: Miau!" ;
	}
}
