package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaCalculadora {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int notaUm, notaDois;
        double media;
        
        System.out.println("Digite a Primeira Nota");
        notaUm = sc.nextInt();
        System.out.println("Digite a Segunda Nota");
        sc.nextLine();
        notaDois = sc.nextInt();
        media = (notaUm + notaDois)/2.0;
        System.out.printf("A media da soma entre %d + %d eh = %.2f%n", notaUm, notaDois, media);
        
        sc.close();
    }
    
}
