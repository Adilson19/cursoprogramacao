package entities;

public class Desenvolvedor extends Funcionario {
	public Desenvolvedor() {
		
	}
	
	public Desenvolvedor(String nome, Double salarioBase) {
		super(nome, salarioBase);
	}


	@Override
	public Double calcularSalarioTotal() {
		return getSalarioBase() + 1000.0;
	}
}
