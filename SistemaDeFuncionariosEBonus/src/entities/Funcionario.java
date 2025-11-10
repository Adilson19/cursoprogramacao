package entities;

public class Funcionario {
	private String nome;
	private Double salarioBase;
	
	public Funcionario() {
		
	}
	
	
	public Funcionario(String nome, Double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double calcularSalarioTotal(){
		return salarioBase;
	}
}
