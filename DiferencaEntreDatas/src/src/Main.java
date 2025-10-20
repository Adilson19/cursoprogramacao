package src;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate dataInicial = LocalDate.now();
		LocalDate dataFinal = LocalDate.parse("2028-10-20");
		
		Period periodo = Period.between(dataInicial, dataFinal);
		System.out.println("Diferenca entre as datas: " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
		
		LocalTime horaInicial = LocalTime.parse("08:00:00");
		LocalTime horaFinal = LocalTime.parse("15:30:45");
		Duration duracao = Duration.between(horaInicial, horaFinal);
		long horas = duracao.toHours();
		long minutos = duracao.toMinutes() % 60;
		long segundos = duracao.toSeconds() % 60;
		System.out.println("Diferenca entre as datas: " + horas + "h " + minutos + "m " + segundos + "s");
	}

}
