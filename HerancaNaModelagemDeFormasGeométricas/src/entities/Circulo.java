package entities;

public class Circulo extends FormaGeometrica {
	private double raio;
	
	public Circulo() {
		
	}
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double calcularArea() {
		return Math.PI * getRaio() * getRaio();
	}
}
