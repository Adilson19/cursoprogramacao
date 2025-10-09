package exerciciosSobreVetoresMatrizes;

import static java.lang.Math.sqrt;
import java.util.Locale;
import java.util.Scanner;

public class Vector004 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = 15;
        int[] vectA = new int[n];
        double[] vectB = new double[n];
        
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i];
            vectB[i] = sqrt(vectB[i]);
        }
        
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("VectA = %d, VectB = %.2f%n", vectA[i], vectB[i]);
        }
        
        sc.close();
    }
    
}
