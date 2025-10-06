package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMediaVector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        //sc.nextLine();        
        double[] vect = new double[n];
        
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i];
        }
        double media = soma / vect.length;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i]< media){
                System.out.printf("%.1f%n", vect[i]);
            }
        }
        
        
        sc.close();
    }
    
}
