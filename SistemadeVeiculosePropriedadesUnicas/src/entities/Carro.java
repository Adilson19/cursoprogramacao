package entities;

public final class Carro extends VeiculoMotorizado{
	private int numeroPortas;
	public Carro() {
		
	}
	public Carro(String marca, int ano, int numeroPortas) {
		super(marca, ano);
		this.numeroPortas = numeroPortas;
	}
	
	
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	@Override
	public String exibirDetalhes(){
		return getMarca() + " - " + getAno() + " Numero de Portas: " + getNumeroPortas();
	}
	
}
