import java.util.Locale;
import java.util.Scanner;


public class EstruturaDoWhile {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char resp;
        //  O bloco de comandos executa pelo menos uma vez, pois a condicao eh verificada no final
        do{
            System.out.printf("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        }while(resp != 'n');
        
        sc.close();
    }
}
