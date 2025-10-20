package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		//	1. Crie um objeto LocalDate para a data atual.
		LocalDate dataAtual = LocalDate.now();
		//	2. Crie um objeto LocalTime para a hora atual.
		LocalTime horaAtual = LocalTime.now();
		//	3. Crie um objeto LocalDateTime que combine a data e hora atuais.
		LocalDateTime horaData = LocalDateTime.now();
		//	4. Imprima o LocalDateTime atual no formato: dd/MM/yyyy HH:mm:ss.
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
		String dataHoraFormatada = horaData.format(fmt1);
		
		
		//	Resultados de acordo a ordem
		System.out.println("Data Actual = " + dataAtual);
		System.out.println("Hora Actual = " + horaAtual);
		System.out.println("Hora e Data Actual = " + horaData);	
		System.out.println("Hora no formato dd/MM/yyyy HH:mm:ss = " + dataHoraFormatada);

	}

}
