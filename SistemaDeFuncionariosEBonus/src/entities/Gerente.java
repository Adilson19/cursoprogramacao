package entities;

public class Gerente extends Funcionario{
	private Double percentualBonus; 
	
	public Gerente(){
		
	}

	public Gerente(String nome, Double salarioBase, Double percentualBonus) {
		super(nome, salarioBase);
		this.percentualBonus = percentualBonus;
	}

	@Override
	public Double calcularSalarioTotal(){
		return getSalarioBase() + (getSalarioBase() * percentualBonus);
	}
}
