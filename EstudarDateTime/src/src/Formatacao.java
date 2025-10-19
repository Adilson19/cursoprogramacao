package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Formatacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate d04 = LocalDate.parse("2025-10-19");
		LocalDateTime d05 = LocalDateTime.parse("2025-10-19T09:10:10");
		Instant d06 = Instant.parse("2025-10-19T09:10:20Z");
		
		//		FORMATACAO DAS DATAS E HORAS
		//	Formatacao de Data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//	Formatacao de Data e Hora
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//	Formatacao de Data e Hora levando em consideracao o fuso horario
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		//	Formatacao usando Nomes - eh uma data local, sem fuso horario
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		//	Formatacao usando nomes - ele usa o FUSO HORARIO
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//	Chamando o format(fmt1) - para definir o maneira como sera impressa
		//	Primeira maneira de chamar o fmt1
		System.out.println("d04 = " + d04.format(fmt1));
		//	Segunda maneira de chamar o fmt1
		System.out.println("d04 = " + fmt1.format(d04));
		//	Terceira maneira de chamar o fmt1
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		
		//	Data Simplesmente
		System.out.println("d05 = " + d05.format(fmt1));
		//	Data e Hora
		System.out.println("d05 = " + d05.format(fmt2));
		//	Data e hora usando o nome ISO_DATE_TIME
		System.out.println("d05 = " + d05.format(fmt4));
		//	Para imprimir uma data:hora global eh necessario falar qual eh o nosso fuso - e a formatacao eh especifica porque tem fuso horario
		System.out.println("d06 = " + fmt3.format(d06));
		//	Serve [ara imprimir uma data e hora apartir de um nome
		System.out.println("d06 = " + fmt5.format(d06));
		//	imprime data e hora inclusive busca o fuso horario
		System.out.println("d06 = " + d06.toString());
		
		
		sc.close();

	}

}
