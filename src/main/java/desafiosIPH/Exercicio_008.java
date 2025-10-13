package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_008 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // --- Informações Fixas ---
        final double SALARIO_FIXO = 800.00; // Salário fixo em AKZ
        final double PERCENTUAL_COMISSAO = 0.15; // 15% em formato decimal (0.15)

        // --- Leitura de Dados ---
        System.out.printf("Salario Fixo Mensal: AKZ %.2f\n", SALARIO_FIXO);
        
        // Solicitando o valor das vendas do mês
        System.out.print("Por favor, digite o valor total das vendas do funcionario (em AKZ): ");
        double valorVendas = sc.nextDouble();
        
        // --- Processamento dos Dados ---
        
        // 1. Cálculo da Comissão
        double valorComissao = valorVendas * PERCENTUAL_COMISSAO;
        
        // 2. Cálculo do Salário Total
        double salarioTotal = SALARIO_FIXO + valorComissao;
        
        // --- Exibição dos Resultados ---
        System.out.printf("Valor das Vendas no Mes: AKZ %.2f\n", valorVendas);
        System.out.printf("Comissao (15%% de AKZ %.2f): AKZ %.2f\n", valorVendas, valorComissao);
        System.out.println("----------------------------------------------");
        System.out.printf("SALARIO FIXO:              AKZ %.2f\n", SALARIO_FIXO);
        System.out.printf("SALARIO TOTAL A RECEBER:   AKZ %.2f\n", salarioTotal);
        System.out.println("==============================================");
        
        sc.close();
    }
}
