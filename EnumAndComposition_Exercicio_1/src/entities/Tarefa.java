package entities;

import enums.entities.Prioridade;

public class Tarefa {
	private String titulo;
	private Prioridade prioridade;
	
	public Tarefa(String titulo, Prioridade prioridade) {
		this.titulo = titulo;
		this.prioridade = prioridade;
	}
	//	Podemos nao usar getters e setters
	/*
	public void setTarefa(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
	public Prioridade getPrioridade() {
		return prioridade;
	}*/
	
	public String toString() {
		return "Tarefa [Titulo: "+titulo+", Prioridade: "+prioridade+"]";
	}
	
}
