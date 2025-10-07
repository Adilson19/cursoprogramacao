package application;
import java.util.Scanner;
import java.util.Locale;
public class MediaParesVector {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    int[] vect = new int [n];
    int soma = 0;
    int cont = 0;
    for(int i = 0; i< vect.length; i++){
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
        if(vect[i]%2==0){
            soma += vect[i];
            cont++;
        }        
    }
    double media = 0.0;
    if(soma > 0){
        media = soma / cont;
        System.out.printf("MEDIA DOS PARES = %.1f", media);
    }else if(soma==0){
        System.out.println("NENHUM NUMERO PAR");
    }
    
    sc.close();
    }
}
