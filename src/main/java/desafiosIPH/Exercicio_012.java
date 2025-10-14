package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_012 {

	    /**
	     * Calcula o novo valor da prestação em atraso usando a fórmula de juros simples:
	     * Prestação = Valor Base + Juros
	     * Onde Juros = Valor Base * Taxa Diária * Dias de Atraso
	     *
	     * @param valorBase O valor original da prestação.
	     * @param taxaAnual A taxa de juros anual imposta (ex: 12.0 para 12% ao ano).
	     * @param diasAtraso O número de dias em atraso.
	     * @return O valor total da prestação com os juros.
	     */
	    public static double calcularPrestacao(double valorBase, double taxaAnual, int diasAtraso) {
	        // 1. Converter a Taxa Anual para uma Taxa Diária
	        // Taxa Diária = (Taxa Anual / 100) / 360
	        // Assumimos 360 dias para simplificar o cálculo financeiro, como é comum.
	        double taxaDiariaDecimal = (taxaAnual / 100.0) / 360.0;

	        // 2. Aplicar a fórmula "Juros Simples": Juros = Valor * Taxa * Tempo
	        // Juros = valorBase * taxaDiariaDecimal * diasAtraso
	        double valorJuros = valorBase * taxaDiariaDecimal * diasAtraso;

	        // 3. Aplicar a fórmula final: Prestação = Valor Base + Juros
	        double valorTotalPrestacao = valorBase + valorJuros;

	        return valorTotalPrestacao;
	    }

	    public static void main(String[] args) {
	    	Locale.setDefault(Locale.US);
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("--- Calculadora de Prestação em Atraso (Juros Simples Anual) ---");

	        try {
	            // Leitura do Valor da Prestação
	            System.out.print("Digite o VALOR ORIGINAL da prestação (R$): ");
	            double valor = scanner.nextDouble();

	            // Leitura da Taxa de Juros
	            System.out.print("Digite a TAXA DE JUROS ANUAL imposta (Ex: 12.0 para 12% a.a.): ");
	            double taxa = scanner.nextDouble();

	            // Leitura do Número de Dias em Atraso
	            System.out.print("Digite o número de dias em ATRASO: ");
	            int tempo = scanner.nextInt();

	            // Validação simples
	            if (valor <= 0 || taxa < 0 || tempo < 0) {
	                 System.out.println("\nErro: Os valores devem ser positivos.");
	                 return;
	            }

	            // Chamada da função de cálculo
	            double valorTotal = calcularPrestacao(valor, taxa, tempo);

	            // Exibição dos resultados
	            double valorJuros = valorTotal - valor;

	            System.out.println("\n--- Resultado do Cálculo ---");
	            System.out.printf("Valor Original da Prestação: R$ %.2f\n", valor);
	            System.out.printf("Taxa de Juros Anual Aplicada: %.2f%%\n", taxa);
	            System.out.printf("Dias em Atraso: %d\n", tempo);
	            System.out.printf("Juros (R$): R$ %.2f\n", valorJuros);
	            System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f\n", valorTotal);

	        } catch (java.util.InputMismatchException e) {
	            System.out.println("\nErro: Entrada inválida. Certifique-se de digitar números para o valor e a taxa, e um número inteiro para os dias.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
	
	
	
	
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double prestacao = 0;
		double valorDaPrestacao = 0;
		double taxaDeJuro = 0.0;
		int tempo;
		
		System.out.println("Digite o valor da prestacao: ");
		valorDaPrestacao = sc.nextDouble();
		System.out.println("Digite a taxa de juros imposta pelo Banco: ");
		taxaDeJuro = sc.nextDouble();
		double percentagemDaTaxa = taxaDeJuro / 100;
		System.out.println("Digite o numero de dias em atraso: ");
		tempo = sc.nextInt();
		
		prestacao = valorDaPrestacao + (valorDaPrestacao * percentagemDaTaxa * tempo);
		
		System.out.printf("O valor de uma prestação em atraso: %.2f", prestacao);
		
		sc.close();

	}

}*/
