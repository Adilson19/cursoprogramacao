import java.util.Locale;

public class Main {
    public static void main(String[] args){
        
        int y = 32;
        double x = 10.35784;
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
        
    }
}
