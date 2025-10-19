package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//	Instanciando o time de data apartir da Classe DateTimeFormatter - que serve para converter data do String para Objeto de formato data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		//	Instanciando o time de data num novo formato
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		//	Instanciando a hora apartir do Objecto LocalDate
		LocalDate d01 = LocalDate.now();
		
		//	Instanciando com o LocalDateTime uma data e hora
		LocalDateTime d02 = LocalDateTime.now();
		
		//	Instanciando com instant Z-> indica que eh uma hora GMT
		Instant d03 = Instant.now();
		
		//	Pegar um texto ISO e gerar uma data apartir dela
		LocalDate d04 = LocalDate.parse("2025-10-19");
		
		//	Pegar um textp ISO e gerasr um data apartir dela com o Objecto LocalDateTime
		LocalDateTime d05 = LocalDateTime.parse("2025-10-19T08:44:00");
		
		//	Pegar um texto ISO e gerar uma data apartr dela com o objecto Instant no padrao UTC
		Instant d06 = Instant.parse("2025-10-19T08:48:00Z");
		
		//	Instanciar com uma data que colocamos e o sistema converte no horario de londres apartir do fuso definido
		Instant d07 = Instant.parse("2025-10-19T08:48:00+01:00");
		
		//	Ele ira converter a data que receber como parametro para o formato Expecificado no time de data apartir da Classe DateTimeFormatter - que serve para converter data do String para Objeto de formato data
		LocalDate d08 = LocalDate.parse("19/10/2025", fmt1);
		
		//	Quando quisermos utilizar um formato diferente primeiro devemos especificar esse mesmo formato antecipadamente
		LocalDateTime d09 = LocalDateTime.parse("19/10/2025 01:30", fmt2);
		
		//	Uma outra maneira de instanciar data
		LocalDate d10 = LocalDate.of(2025, 10, 19);
		
		//	Uma outra maneira de instanciar data e hora
		LocalDateTime d11 = LocalDateTime.of(2025, 10, 19, 8, 30);
		
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
		
		sc.close();
	}
}
