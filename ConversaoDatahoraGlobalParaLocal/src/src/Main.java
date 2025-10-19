package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate d04 = LocalDate.parse("2025-10-19");
		LocalDateTime d05 = LocalDateTime.parse("2025-10-19T09:44:20");
		Instant d06 = Instant.parse("2025-10-19T09:44:20Z");
		
		
		//	Convertendo um instante para uma data local considerando o fuso horario do computador
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//	Convertendo um instante para uma data local considerando um fuso horario especifico
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//	Convertendo data e hora local a hora normal de londres
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		//	Convertendo data e hora local para portugal
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//	Pega o dia do mes
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		//	Pega o mes corrente
		System.out.println("d04 mes = " + d04.getMonthValue());
		//	Pega o ano corrente
		System.out.println("d04 mes = " + d04.getYear());
		
		
		//	Pega a hora
		System.out.println("d05 hora = " + d05.getHour());
		//	Pega o minuto
		System.out.println("d05 minuto = " + d05.getMinute());
		
		sc.close();
	}

}
