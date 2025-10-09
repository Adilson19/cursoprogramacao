package exerciciosSobreVetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Vector007 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n =10;
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];
        
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
            sc.nextLine();
            vectB[i] = sc.nextInt();
            sc.nextLine();
            vectC[i] = vectA[i] - vectB[i];
        }
        
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("VectA: %d - VectB: %d = VectC: %d%n", vectA[i], vectB[i], vectC[i]);
        }
        
        sc.close();
    }
    
}
