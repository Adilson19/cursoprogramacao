package application;
import java.util.Scanner;
import java.util.Locale;
public class SomaVector {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    double[] vect = new double [n];
    for(int i = 0; i < vect.length; i++){
        System.out.print("Digite um numero: ");
        sc.nextLine();
        vect[i] = sc.nextInt();
    }
    System.out.print("VALORES = ");
    for(int i = 0; i < vect.length; i++){
        System.out.printf("%.1f ", vect[i]);
    }
    
    System.out.print("SOMA = ");
    double soma = 0.0;
    for(int i = 0; i < vect.length; i++){
        soma += vect[i];
    }
    System.out.println(soma);
    
    System.out.println("MEDIA = ");
    double media = 0.0;
    for(int i = 0; i < vect.length; i++){
        media += vect[i];
    }
    System.out.println(media);
    
    sc.close();
   }
}
