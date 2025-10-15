package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDate {
    public static void main(String[] args){
    	
    	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    	
        //  Retorna a data do Sistema e instanciou no Objeto
        LocalDate d01 = LocalDate.now();
        //  Data hora local
        LocalDateTime d02 = LocalDateTime.now();
        //  Horario Global - De Londes, GMT
        Instant d03 = Instant.now();
        //	Pegar um texto ISO 8601 para converter para data
        LocalDate d04 = LocalDate.parse("2025-10-12");
        //  Pegar uma hora completa em texto e converter em data
        LocalDateTime d05 = LocalDateTime.parse("2025-10-12T08:02:30");
        //	Gerar uma data-hora no padrao UTC
        Instant d06 = Instant.parse("2025-10-15T06:50:25Z");
        //	
        Instant d07 = Instant.parse("2025-10-15T06:50:25");
        
        //	Customizado
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        //	Outra maneira de customizar a data a partir do DateTimeFormatter
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        //	
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        //	
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
        //	
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d010 = " + d10);
        System.out.println("d011 = " + d11);
        
        
    }    
}
