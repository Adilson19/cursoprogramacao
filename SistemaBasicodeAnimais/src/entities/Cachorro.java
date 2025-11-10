package entities;

public class Cachorro extends Animal {
	public Cachorro() {
		
	}

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return getNome() + " late: Au Au!";
	}
	
	public String brincar() {
		return "Brincando de apanhar a bola";
	}
}