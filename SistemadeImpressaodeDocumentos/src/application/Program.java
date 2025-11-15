package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Documentos;
import entities.PDF;
import entities.WordDoc;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Documentos> list = new ArrayList<>();
		
		System.out.println("1- PDF ou 2- WordDoc? ");
		char resp = sc.next().charAt(0);
		if(resp == 1 ) {
			list.add(new PDF());
			list.add(new PDF());
			list.add(new PDF());
			list.add(new PDF());
			list.add(new PDF());
		}else if(resp == 2){
			list.add(new WordDoc());
			list.add(new WordDoc());
			list.add(new WordDoc());
			list.add(new WordDoc());
			list.add(new WordDoc());
		}
		System.out.println("Lista de tipo de Documento: ");
		for(Documentos ver : list) {
			System.out.printf(String.format("%s", ver.imprimir()));
		}
		sc.close();
	}

}
