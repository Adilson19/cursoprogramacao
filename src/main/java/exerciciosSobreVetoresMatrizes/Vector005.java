package exerciciosSobreVetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Vector005 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        
        for(int i = 1; i < n; i++){
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i] * i;
        }
        
        for(int i = 1; i < n; i++){
            System.out.printf("VectA = %d, VectB = %d%n", vectA[i], vectB[i]);
        }
        
        sc.close();
    }
}
