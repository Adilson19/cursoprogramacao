package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	
	
}
