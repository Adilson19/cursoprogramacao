package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double provaUm, provaDois, provaTres;
        int pesoUm = 2, pesoDois = 3, pesoTres = 5;
        double media;
        double calculoNumerador;
        double calculoDenominador;
        
        System.out.println("Digite as notas do Aluno:");
        provaUm = sc.nextDouble();
        sc.nextLine();
        provaDois = sc.nextDouble();
        sc.nextLine();
        provaTres = sc.nextDouble();
        
        calculoNumerador = (provaUm*pesoUm) + (provaDois*pesoDois) + (provaTres*pesoTres);
        calculoDenominador = pesoUm + pesoDois + pesoTres;
        media =  calculoNumerador / calculoDenominador;
        
        System.out.printf("Nota 1 - %.2f com Peso %d%n",provaUm, pesoUm);
        System.out.printf("Nota 2 - %.2f com Peso %d%n",provaDois, pesoDois);
        System.out.printf("Nota 3 - %.2f com Peso %d%n",provaTres, pesoTres);
        System.out.printf("Media Final do Aluno = %.2f Valores%n", media);
        
        sc.close();
    }
}
