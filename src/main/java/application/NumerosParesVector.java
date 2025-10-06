package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosParesVector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        int [] vectNumero = new int[n];
        for(int i = 0; i < vectNumero.length; i++){
            System.out.print("Digite um numero: ");
            vectNumero[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        int count = 0;
        for(int i = 0; i < vectNumero.length; i++){
            if(((vectNumero[i] % 2 == 0)) && ((vectNumero[i] / vectNumero[i]) == 0)){
                System.out.printf("%d ", vectNumero[i]);
                count++;
            }
        }
        System.out.printf("%nQUANTIDADE DE PARES = %d", count);
        sc.close();
    }
}
