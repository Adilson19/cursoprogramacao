package entities;

public class Funcionario {
	private Integer idade;
	private String nome;
	private Double qtHoras;
	private char sexo;
	private Double valorHora;
	
	public Funcionario(){
		
	}
	public Funcionario(int i, String n, char s, double q, double v){
		this.idade = i;
		this.nome = n;
		this.qtHoras = q;
		this.sexo = s;
		this.valorHora = v;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQtHoras(double qtHoras) {
		this.qtHoras = qtHoras;
	}
	public double getQtHoras() {
		return qtHoras;
	}
	public double getSalarioBruto() {
		return ;
	}
	public double getSalarioLiquido() {
		return ;
	}
	public char getSexo() {
		return ;
	}
	public double getValorHora() {
		return;
	}
	
	public double getImpostoRetido() {
		return ;
	}
	
	
	
	
	
	
	public double reajustarValorHora(double x) {
		
	}
	
	
}
