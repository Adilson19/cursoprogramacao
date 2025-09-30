package util;

/*
* Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
* ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
* pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
* sobre o valor em dólar. Criar uma classe 'CurrencyConverter' para ser
* responsável pelos cálculos.
*/

public class CurrencyConverter {
	private static final double IOF = 6.00;

	public static double getPaid(double exchange, double bought) {
		return (bought * exchange) * (1 + IOF / 100);
	}
}