package desafiosIPH;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_011 {

    /**
     * Calcula o total pago e o saldo devedor de um consórcio.
     *
     * @param totalPrestacoes O número total de prestações do consórcio.
     * @param prestacoesPagas A quantidade de prestações já pagas.
     * @param valorPrestacao O valor atual de cada prestação.
     */
    public static void calcularValores(int totalPrestacoes, int prestacoesPagas, double valorPrestacao) {
        // 1. Calcular o Total Pago
        // Total Pago = Quantidade de Prestações Pagas * Valor da Prestação
        double totalPago = prestacoesPagas * valorPrestacao;

        // 2. Calcular o Total de Prestações a Pagar (Saldo)
        int prestacoesRestantes = totalPrestacoes - prestacoesPagas;

        // 3. Calcular o Saldo Devedor
        // Saldo Devedor = Prestações Restantes * Valor da Prestação
        double saldoDevedor = prestacoesRestantes * valorPrestacao;

        // 4. Exibir os resultados
        System.out.println("\n--- Resultados do Consórcio ---");
        System.out.printf("Valor da Prestação: R$ %.2f\n", valorPrestacao);
        System.out.printf("Prestações Pagas: %d\n", prestacoesPagas);
        System.out.printf("Total Pago: R$ %.2f\n", totalPago);
        System.out.printf("Prestações Restantes: %d\n", prestacoesRestantes);
        System.out.printf("Saldo Devedor: R$ %.2f\n", saldoDevedor);

        // Verificação simples
        double valorTotalDoConsorcio = totalPrestacoes * valorPrestacao;
        System.out.printf("Valor Total (Teórico) do Consórcio: R$ %.2f\n", valorTotalDoConsorcio);
        // A soma do total pago e do saldo devedor deve ser igual ao valor total do consórcio
        // (assumindo que o valor da prestação não mudou)
    }

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        // Exemplo de uso com valores fixos
        System.out.println("--- Exemplo 1: Valores Fixos ---");
        calcularValores(60, 15, 850.50);

        // Exemplo de uso com entrada do usuário
        System.out.println("\n--- Exemplo 2: Entrada do Usuário ---");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número TOTAL de prestações: ");
            int total = scanner.nextInt();

            System.out.print("Digite a quantidade de prestações PAGAS: ");
            int pagas = scanner.nextInt();

            System.out.print("Digite o VALOR ATUAL da prestação (Ex: 500,00): ");
            // Usamos nextDouble para aceitar valores com casas decimais (vírgula ou ponto, dependendo da configuração regional)
            double valor = scanner.nextDouble();

            // Chamada do método
            calcularValores(total, pagas, valor);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números inteiros para as quantidades e um número para o valor.");
        }
    }
}











/*package desafiosIPH;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double totalPrestacao = 0.0;
		double quantidadeDePrestacoesPagas = 0.0;
		double valorAtualDaPrestacao = 0.0;
		double totalPagoPeloConsorcio = 0.0;
		double saldoDevedor = 0.0;
		
		
		
		
		sc.close();
	}
	
}*/
