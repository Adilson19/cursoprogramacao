package application;
import java.util.Scanner;
import java.util.Locale;

public class SomaVectores {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vector? ");
        int n = sc.nextInt();
        int[] vectSoma1 = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vectSoma1.length; i++){
            vectSoma1[i] = sc.nextInt();
        }
        
        int[] vectSoma2 = new int[n];
        System.out.println("Digite os valores do vetor B:");
        for(int i = 0; i < vectSoma2.length; i++){
            vectSoma2[i] = sc.nextInt();
        }
        
        int[] vectTotal = new int[n];
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vectTotal.length; i++){
            vectTotal[i] = vectSoma1[i] + vectSoma2[i];
            System.out.println(vectTotal[i]);
        }
        
        
        sc.close();
    }
}
