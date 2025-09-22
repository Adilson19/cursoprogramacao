import java.util.Locale;

public class Main {
    public static void main(String[] args){
        
        int y = 32;
        double x = 10.35784;
        // String nome para depois o sistema retornar
        String nome = "Adelino";
        int idade = 25;
        double renda = 50000.0;
        //  Exemplo da Tarefa
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        
        System.out.println(y);
        System.out.println(x);
        // "%.2f" -> representa o numero de casas decimais apos a virgula 
        // %n representa o paragrafo apos as casas
        System.out.printf("%.2f%n", x);
        // Imprimindo com 4 casas decimais
        System.out.printf("%.4f%n", x);
        // Para considerar o separador dos USA
        //Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Ola  mundo! Sousa");
        // Concatenando elementos
        System.out.println("RESULTADO = " + x + " METROS");
        // Outra maneira de concatenar
        System.out.printf("RESULTADO = %.2f metros%n", x);
        // Exemplo de concatenacao que envolve 3 variaveis
        System.out.printf("%s tem %d anos e ganha KZ %.2f KWANZA%n", nome, idade, renda);
        
        System.out.printf("Products:%n%s, wich price is $ %.2f %n%s, which price is $ %.2f %n%nRecord: %d years old, code %d and gender: %s %n%nMeasue with eight decimal places: %.8f %nRouded (three decimal places): %.3f %n", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        
        
        
        
    }
}
