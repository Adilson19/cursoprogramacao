package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoDate {
    public static void main(String[] args){
        //  Retorna a data do Sistema e instanciou no Objeto
        LocalDate d01 = LocalDate.now();
        //  Data hora local
        LocalDateTime d02 = LocalDateTime.now();
        //  Horario Global - De Londes, GMT
        Instant d03 = Instant.now();
        //
        LocalDate d04 = LocalDate.parse("2025-10-12");
        //  
        LocalDateTime d05 = LocalDateTime.parse("2025-10-12T08:02:30");
        
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        
        
        
    }    
}
