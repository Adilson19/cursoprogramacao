package entities;

public abstract class Pessoa {
	private String nome;
	private Double rendaAnual;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	public String getName() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	public Double getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double pagarImposto() {
		return 0;
	}
	
}
