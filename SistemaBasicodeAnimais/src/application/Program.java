package application;

import java.util.ArrayList;
import java.util.List;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;

public class Program {

	public static void main(String[] args) {
		
		List<Animal>list = new ArrayList<>();
		
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Max");
		cachorro.emitirSom();
		//System.out.println(String.format(cachorro.emitrSom()));
		//System.out.println(String.format(cachorro.brincar()));
		
		Gato gato = new Gato();
		gato.setNome("Vitoria");
		gato.emitirSom();
		//System.out.println(String.format(gato.emitrSom()));
		list.add(new Cachorro(cachorro.getNome(), cachorro.getIdade()));
		list.add(new Gato(gato.getNome(), gato.getIdade()));
		
		for(Animal animal : list) {
			System.out.println(animal.emitirSom());
		}
		
	}

}
