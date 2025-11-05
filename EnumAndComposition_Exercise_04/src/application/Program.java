package application;

import entities.Departamento;
import entities.Funcionario;
import entities.enums.NivelSenioridade;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --- A. CRIAÇÃO DE FUNCIONÁRIOS ---
        Funcionario f1 = new Funcionario("Ana Silva", 3500.00, NivelSenioridade.JUNIOR);
        Funcionario f2 = new Funcionario("Bruno Costa", 6800.00, NivelSenioridade.PLENO);
        Funcionario f3 = new Funcionario("Carlos Souza", 12000.00, NivelSenioridade.SENIOR);
        Funcionario f4 = new Funcionario("Daniela Lima", 4200.00, NivelSenioridade.JUNIOR);
        Funcionario f5 = new Funcionario("Adelino Sousa", 50000.00, NivelSenioridade.JUNIOR);

        // --- B. CRIAÇÃO DO DEPARTAMENTO ---
        Departamento deptoTI = new Departamento("Tecnologia da Informação");

        // --- C. ADIÇÃO DE FUNCIONÁRIOS AO DEPARTAMENTO ---
        System.out.println("✅ Adicionando funcionários ao departamento...");
        deptoTI.addFuncionario(f1);
        deptoTI.addFuncionario(f2);
        deptoTI.addFuncionario(f3);
        deptoTI.addFuncionario(f4);
        deptoTI.addFuncionario(f5);

        System.out.println("\n");
        // --- D. IMPRIMIR O RESUMO E A FOLHA SALARIAL TOTAL ---     
        System.out.println("✅ Departamento Montado e Pronto para Impressão.");
        System.out.println(deptoTI);
        // --- E. SIMULAÇÃO DE REMOÇÃO E NOVO CÁLCULO ---
        System.out.println("\n⛔ Removendo funcionário: Daniela Lima...");
        deptoTI.removeFuncionario(f4);
        
        System.out.println(deptoTI);        
	}

}
