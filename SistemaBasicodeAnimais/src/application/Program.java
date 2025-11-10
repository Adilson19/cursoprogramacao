package application;

import entities.Cachorro;
import entities.Gato;

public class Program {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.emitrSom();
		System.out.println(String.format(cachorro.emitrSom()));
		
		Gato gato = new Gato();
		gato.emitrSom();
		System.out.println(String.format(gato.emitrSom()));
	}

}
