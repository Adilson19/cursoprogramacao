package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_007 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double saldoCliente = 500.00;
        double saldoAdicional = 0;
        
        System.out.print("Digite o valor do Cheque: ");
        saldoAdicional = sc.nextDouble();
        saldoCliente += saldoAdicional;
        System.out.printf("O saldo atual do cliente = %.2f AKZ%n", saldoCliente);
        
        
        sc.close();
    }
}
