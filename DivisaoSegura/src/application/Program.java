package application;

public class Program {
	public static Double divisaoSegura(int numerador, int denominador) {
		try {
			//	Tenta realizar a divisao
			//	Convertendo para double para permitir decimais
			return (double) numerador / denominador;
		}
		catch(ArithmeticException e) {
			//	Captura especificamente erros aritmetricos (como divisao por zero em inteiros)
			System.out.println("Erro: Nao eh possivel dividir por zero.");
			
			//	Retorna -1 conforme sugerido no exercicio (ou poderia retornar null se o tipo fosse Double)
			return -1.0;
		}
	}
	 public static void main(String[] args) {
		 //	Teste 1
		 System.out.println("Resultado: " + divisaoSegura(10, 2));
		 //	Teste 2
		 System.out.println("Resultado: " + divisaoSegura(5, 0));
	 }
}
