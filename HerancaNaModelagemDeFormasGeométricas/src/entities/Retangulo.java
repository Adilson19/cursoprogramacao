package entities;

public class Retangulo extends FormaGeometrica {
	private double largura;
	private double altura;
	
	
	
	@Override
	public Double calcularArea() {
		return largura * altura;
	}
}
