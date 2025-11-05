package entities;

import entities.enums.NivelSenioridade;

public class Funcionario {
	private String nome;
	private Double salario;
	private NivelSenioridade nivel;
	
	
	public Funcionario(String nome, Double salario, NivelSenioridade nivel) {
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String toString() {
		return nome + " (" + nivel + ")" + " - Salario: R$" + String.format("%.2f", salario);
	}
}
