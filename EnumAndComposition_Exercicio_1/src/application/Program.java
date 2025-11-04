package application;

import entities.Tarefa;
import enums.entities.Prioridade;

public class Program {
	public static void main (String[] args) {
		System.out.println("---- Exercicio 1: Tarefas e Prioridades -----");
		
		Tarefa t1 = new Tarefa("Pagar Contas", Prioridade.ALTA);
		Tarefa t2 = new Tarefa("Estudar Java", Prioridade.URGENTE);
		Tarefa t3 = new Tarefa("Ir a academia", Prioridade.BAIXA);
		Tarefa t4 = new Tarefa("Trabalhar No Projeto da dama do Benny Ice", Prioridade.URGENTE);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
