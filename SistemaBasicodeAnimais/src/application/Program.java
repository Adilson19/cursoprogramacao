package application;

import entities.Cachorro;
import entities.Gato;

public class Program {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Max");
		cachorro.emitrSom();
		System.out.println(String.format(cachorro.emitrSom()));
		System.out.println(String.format(cachorro.brincar()));
		
		Gato gato = new Gato();
		gato.setNome("Vitoria");
		gato.emitrSom();
		System.out.println(String.format(gato.emitrSom()));
		
		
	}

}
