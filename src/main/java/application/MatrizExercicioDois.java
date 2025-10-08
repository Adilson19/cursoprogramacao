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
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //  Recebendo o numero
        
        
        
        
        
        sc.close();
    }
}
