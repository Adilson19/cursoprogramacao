package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	
	List<Funcionario> funcionarios = new ArrayList<>();
	
	public Departamento(String nome) {
		this.nome = nome;
	}
	
	public void addFuncionario(Funcionario f) {
		funcionarios.add(f);
	}
	public void removeFuncionario(Funcionario f) {
		funcionarios.remove(f);
	}
	
	public double calcularFolhaSalarial() {
		double soma = 0.0;
		for(Funcionario f : funcionarios) {
			soma += f.getSalario();
		}
		return soma;
	}
	
	public String resumoFuncionarios() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(nome).append("\n");
		sb.append("Salario: ");
		for(Funcionario f:funcionarios) {
			sb.append();
		}
	}
}
