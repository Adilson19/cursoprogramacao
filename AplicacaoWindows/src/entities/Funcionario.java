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
	double salarioBruto;
	public double getSalarioBruto() {
		return salarioBruto;
	}
	double salarioLiquido;
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public char getSexo() {
		return sexo;
	}
	public double getValorHora() {
		return valorHora;
	}
	double impostoRetido;
	public double getImpostoRetido() {
		return impostoRetido;
	}
	
	
	
	
	
	
	public double reajustarValorHora(double x) {
		this.valorHora = x;
		return valorHora;
	}
	
	
}
