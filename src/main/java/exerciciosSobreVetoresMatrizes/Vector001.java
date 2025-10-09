package exerciciosSobreVetoresMatrizes;
import java.util.Scanner;
import java.util.Locale;

public class Vector001 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = 5;
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        for(int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
            vectB[i] = vectA[i];
        }
        for(int i = 0; i < vectB.length; i++){
            System.out.printf("vectA = %d, vectB = %d%n", vectA[i], vectB[i]);
        }
        
        sc.close();
    }
}
