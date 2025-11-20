package entities;

public class Livro {
	private String titulo;
	private String autor;
	private Integer numeroPaginas;
	
	public Livro() {
		
	}
	public Livro(String titulo, String autor, Integer numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String mostrarDetalhes(String titulo, String autor, Integer numeroPaginas) {
		return "O titulo: " + titulo + " Autor: " + autor + " Numero de Paginas: " + numeroPaginas;
	}
}
