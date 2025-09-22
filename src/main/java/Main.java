import java.util.Locale;

public class Main {
    public static void main(String[] args){
        
        int y = 32;
        double x = 10.35784;
        // String nome para depois o sistema retornar
        String nome = "Adelino";
        int idade = 25;
        double renda = 50000.0;
        System.out.println(y);
        System.out.println(x);
        // "%.2f" -> representa o numero de casas decimais apos a virgula 
        // %n representa o paragrafo apos as casas
        System.out.printf("%.2f%n", x);
        // Imprimindo com 4 casas decimais
        System.out.printf("%.4f%n", x);
        // Para considerar o separador dos USA
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Ola  mundo! Sousa");
        // Concatenando elementos
        System.out.println("RESULTADO = " + x + " METROS");
        // Outra maneira de concatenar
        System.out.printf("RESULTADO = %.2f metros%n", x);
        // Exemplo de concatenacao que envolve 3 variaveis
        System.out.printf("%s tem %d anos e ganha KZ %.2f KWANZA%n", nome, idade, renda);
        
    }
}
