package desafiosIPH;

import java.util.Scanner;

public class Exercicio_009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        final double SALARIO_FIXO = 500.00;
        final double BONUS_POR_VENDA = 50.00;
        double bonusTotal;
        double salarioTotal = 0.0;
        int softwareVendidos =0;
        
        System.out.println("Digite a quantidade de Softwares que o funcionario vendeu: ");
        softwareVendidos = sc.nextInt();
        bonusTotal = softwareVendidos * BONUS_POR_VENDA;
        salarioTotal = SALARIO_FIXO + bonusTotal;
        System.out.println("O Salario total do Funcionario = "+salarioTotal);
        
        sc.close();
    }
}
