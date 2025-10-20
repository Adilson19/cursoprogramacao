package src;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		LocalDate feriado = LocalDate.of(2025, 11, 2);
		DayOfWeek diaDaSemana = feriado.getDayOfWeek();
		Month mes = feriado.getMonth();
		boolean isFimDeSemana = diaDaSemana == DayOfWeek.SATURDAY || diaDaSemana == DayOfWeek.SUNDAY; 
		
		System.out.println("Data do feriado = " + feriado);
		System.out.println("O dia da Semana = " + diaDaSemana);
		System.out.println("O nome do mes = " + mes);
		System.out.println("Cai em fim de semana? " + isFimDeSemana);
	}

}
