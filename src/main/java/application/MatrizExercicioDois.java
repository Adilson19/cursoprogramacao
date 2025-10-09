package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExercicioDois {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //  Recebendo o tamanho da matriz
        //  n - numero de linha
        int n = sc.nextInt();  
        //  m - numero de coluna
        int m = sc.nextInt();
        //  instanciando a matriz
        int mat[][] = new int[n][m];
        //  Recebendo os dados
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //  Recebendo o numero
        sc.nextLine();
        int x = sc.nextInt();
        int posN = 0;
        int posM = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; i < m; j++){
                posM = j;
                if(x == mat[i][j]){                    
                    System.out.printf("Position %d,%d:%n", posN, posM);                    
                }
                posN = i;
            }
        }
        System.out.printf("Left: %d%n", posN-1);
        System.out.printf("Right: %d%n", posN+1);
        System.out.printf("Up: %d%n", posM-1);
        System.out.printf("Down: %d%n", posM+1);
        
        
        
        
        sc.close();
    }
}
