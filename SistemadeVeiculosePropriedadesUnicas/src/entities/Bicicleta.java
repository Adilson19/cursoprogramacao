package entities;

public class Bicicleta extends Veiculo {
	public Bicicleta() {
		
	}
	
	public Bicicleta(String marca, int ano) {
		super(marca, ano);
	}


	public Boolean pedalar() {
		return true;
	}
	
	@Override
	public String exibirDetalhes(){
		return getMarca() + " - " + getAno() + " Numero de Portas: " + pedalar();
	}
}
