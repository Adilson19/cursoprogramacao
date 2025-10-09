package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_001 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int nota1, nota2;
        double media;
        System.out.println("Digite uma nota");
        nota1 = sc.nextInt();
        System.out.println("Digite um outra nota");
        sc.nextLine();
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2.0;
        System.out.printf("A media das notas %d, %d eh %.2f %n", nota1, nota2, media);
        
        
        sc.close();
    }
}
