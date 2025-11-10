package entities;

public class Veiculo {
	private String marca;
	private int ano;
	
	public Veiculo() {
		
	}

	public Veiculo(String marca, int ano) {
		super();
		this.marca = marca;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String exibirDetalhes(){
		return getMarca() + " - " + getAno();
	}
	
}
