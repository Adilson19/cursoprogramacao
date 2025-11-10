package entities;

public class Gato extends Animal {
	public Gato() {
		
	}

	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return getNome() + " mia: Miau!" ;
	}
}
