package application;
import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.FormaGeometrica;
import entities.Retangulo;

public class Program {
	public static void main(String[] args) {
		List <FormaGeometrica> list = new ArrayList<>();
		list.add(new Circulo(3));
		list.add(new Retangulo(5, 3));
		
		double soma = 0.0;
		for(FormaGeometrica acc : list) {
			soma += acc.calcularArea();
		}
		System.out.printf("Total Area: %.2f%n", soma);
	}
}
