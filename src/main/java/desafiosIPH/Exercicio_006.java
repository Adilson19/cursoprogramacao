package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int provaUm, provaDois, provaTres, peso;
        double media;
        
        System.out.println("Digite as notas do Aluno:");
        provaUm = sc.nextInt();
        provaDois = sc.nextInt();
        provaTres = sc.nextInt();
        
        media = (provaUm*0.1 + provaDois*0.15 + provaTres*0.25)/3.0;
        
        System.out.printf("Media = %.2f%n", media);
        
        sc.close();
    }
}
