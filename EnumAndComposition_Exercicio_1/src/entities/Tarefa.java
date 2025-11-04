package entities;

import enums.entities.Prioridade;

public class Tarefa {
	private String titulo;
	private Prioridade prioridade;
	
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
	}
	
}
