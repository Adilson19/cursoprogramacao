package src;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		//	1. Crie um LocalDate para a data do seu nascimento (ou uma data de sua escolha, por exemplo, 1995-10-26).
		LocalDate dataNascimento = LocalDate.parse("2000-04-02");
		//	2. Calcule e imprima a data que será 15 dias após essa data.
		LocalDate dataMais15Dias = dataNascimento.plusDays(15);
		LocalDate dataMenos6Meses = dataNascimento.minusMonths(6);
		boolean bissexto = dataNascimento.isLeapYear();
		
		System.out.println("Data base: " + dataNascimento);
		System.out.println("15 dias depois: " + dataMais15Dias);
		System.out.println("6 meses antes: " + dataMenos6Meses);
		System.out.println("O ano de nascimento (" + dataNascimento.getYear() + ") eh bissexto? " + bissexto);
		
		
	}
}
