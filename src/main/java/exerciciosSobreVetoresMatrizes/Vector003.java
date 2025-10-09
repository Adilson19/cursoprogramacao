package exerciciosSobreVetoresMatrizes;

import static java.lang.Math.pow;
import java.util.Locale;
import java.util.Scanner;

public class Vector003 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        
        
        int n = 15;
        int[] vectA = new int [n];
        int[] vectB = new int [n];
        
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i];
            vectB[i] = (int) pow(vectB[i], 2);
        }
        
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("VectA = %d, VectB = %d%n", vectA[i], vectB[i]);
        }
        
        sc.close();
    }
}
