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
	
	public String getNome() {
		return nome;
	}
	
	public double calcularFolhaSalarial() {
		double soma = 0.0;
		for(Funcionario f : funcionarios) {
			soma += f.getSalario();
		}
		return soma;
	}
	
	public String toString() {
        // 1. Inicializa o StringBuilder
        StringBuilder sb = new StringBuilder(); 
        
        // 2. Adiciona o cabeçalho
        sb.append("\n===========================================\n");
        sb.append(">>> RESUMO DO DEPARTAMENTO: ").append(nome.toUpperCase()).append(" <<<\n");
        sb.append("===========================================\n");
        
        // 3. Adiciona a lista de funcionários
        sb.append("FUNCIONÁRIOS ATIVOS (Total: ").append(funcionarios.size()).append("):\n");
        if (funcionarios.isEmpty()) {
            sb.append("  (Nenhum funcionário cadastrado)\n");
        } else {
            for (Funcionario f : funcionarios) {
                // Reutiliza o toString() do Funcionario
                sb.append("  > ").append(f).append("\n"); 
            }
        }
        
        // 4. Adiciona o total da folha salarial
        sb.append("-------------------------------------------\n");
        sb.append("FOLHA SALARIAL TOTAL: R$ ").append(String.format("%.2f", calcularFolhaSalarial()));
        sb.append("\n===========================================");
        
        // 5. Retorna a String final
        return sb.toString(); 
    }
}
