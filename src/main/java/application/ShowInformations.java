package application;

import java.util.Locale;
import java.util.Scanner;

public class ShowInformations {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        double salario;
        
        System.out.println("Digite o seu nome");
        nome = sc.nextLine();
        System.out.println("Digite a sua idade");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o seu salario");
        salario = sc.nextDouble();
        
        System.out.printf("O seu nome eh %s, tens %d anos de idade e o teu salario eh %.2f KZ.%n", nome, idade, salario);
        
        sc.close();
    }
}
