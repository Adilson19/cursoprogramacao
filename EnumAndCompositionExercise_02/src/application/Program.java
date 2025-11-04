package application;

import java.util.Locale;

import entities.enums.UnidadeTempo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		System.out.println("------ Exercicio 2: Conversao de Unidades ----------");
		
		double horas = 2.5;
		double minutos = 15.0;
		double dias = 0.5;
		
		double segundosDasHoras = UnidadeTempo.HORA.converterParaSegundos(horas);
		System.out.printf("%.1f horas equivalem a %.1f segundos%n", horas, segundosDasHoras);
		
		double segundosDosMinutos = UnidadeTempo.MINUTO.converterParaSegundos(minutos);
		System.out.printf("%.1f minutos equivalem a %.1f segundos%n", minutos, segundosDosMinutos);
		
		double segundosDosDias = UnidadeTempo.DIA.converterParaSegundos(dias);
		System.out.printf("%.1f dias equivalem a %.1f segundos%n", dias, segundosDosDias);
	}

}
