package application;
import java.util.Locale;
import java.util.Scanner;

public class MathResolution {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double numeroUm, numeroDois;
        double soma, div, sub, mult;
        
        System.out.println("Digite o primeiro numero");
        numeroUm = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        numeroDois = sc.nextDouble();
        
        soma = numeroUm + numeroDois;
        sub = numeroUm - numeroDois;
        div = numeroUm / numeroDois;
        mult = numeroDois * numeroDois;
        
        System.out.printf("O valor da soma de %.2f + %.2f = %.2f%n", numeroUm, numeroDois, soma);
        System.out.printf("O valor da subtracao de %.2f - %.2f = %.2f%n", numeroUm, numeroDois, sub);
        System.out.printf("O valor da divisao de %.2f / %.2f = %.2f%n", numeroUm, numeroDois, div);
        System.out.printf("O valor da multiplicacao de %.2f * %.2f = %.2f%n", numeroUm, numeroDois, mult);
        
        
        sc.close();
    }
}
