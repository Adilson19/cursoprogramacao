package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_003 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int soma, sub, mult;
        double div;
        System.out.println("Digite um numero");
        n1 = sc.nextInt();
        System.out.println("Digite um outro numero");
        n2 = sc.nextInt();
        soma = n1 + n2;
        sub = n1 - n2;
        div = n1 / n2;
        mult = n1 * n2;
        System.out.println("SOMA = "+soma);
        System.out.println("SUBTRACAO = "+sub);
        System.out.println("MULTIPLICACAO = "+mult);
        System.out.printf("DIVISAO = %.2f%n", div);
        
        
        sc.close();
    }
}
