package desafiosIPH;
import java.util.Scanner;
import java.util.Locale;
public class Exercicio_004 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int a, b, troca;
        
        System.out.println("Digite dois numeros: ");
        a = sc.nextInt();        
        sc.nextLine();
        b = sc.nextInt();
        System.out.printf("A = %d, B = %d", a,b);
        
        troca = a;
        a = b;
        b = troca;
        System.out.println();
        System.out.printf("Trocando A = %d, B = %d", a, b);
        
        sc.close();
    }
    
}
