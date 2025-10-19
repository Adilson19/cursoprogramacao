package src;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//	Instanciando a hora apartir do Objecto LocalDate
		LocalDate d01 = LocalDate.now();
		
		//	Instanciando com o LocalDateTime uma data e hora
		LocalDateTime d02 = LocalDateTime.now();
		
		//	Instanciando com instant Z-> indica que eh uma hora GMT
		Instant d03 = Instant.now();
		//	
		LocalDate d04 = LocalDate.parse("2025-10-19");
		//	
		LocalDateTime d05 = LocalDateTime.parse("2025-10-19");
		//
		
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
	
		
		sc.close();
	}
}
