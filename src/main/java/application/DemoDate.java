package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DemoDate {
    public static void main(String[] args){
    	LocalDate d04 = LocalDateTime.parse("2022-07-20");
    	LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
    	Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
    	
    	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    	DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    	
    	System.out.println("d04 = " + d04.format(fmt1));
    	System.out.println("d04 = " + fmt1.format(d04));
    	System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    	
    	//	Formatando o LocalDateTime com hora e minuto
    	System.out.println("d05 = " + d05.format(fmt1));
    	System.out.println("d05 = " + d05.format(fmt2));
    	
    	System.out.println("d06 = " + fmt3.format(d06));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*
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
        
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);*/
        
        
    }    
}
