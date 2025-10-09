
package exerciciosSobreVetoresMatrizes;
import java.util.Scanner;
import java.util.Locale;
public class Vector006 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];
        
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
            vectB[i] = sc.nextInt();
            vectC[i] = vectA[i] + vectB[i];
        }
        
        for(int i = 0; i < vectA.length; i++){
            System.out.printf("VectA: %d + VectB: %d = VectC: %d%n", vectA[i], vectB[i], vectC[i]);
        }
        
        sc.close();
    }
}
