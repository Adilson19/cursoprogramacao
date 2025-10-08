package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixExercicioUm {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        //  Instanciando a matriz na memoria
        int [][] mat = new int [n][n];
        
        //  Recebendo os valores para preencher a Matriz
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        //  Diagonal principal
        System.out.println("Main diagonal:");
        for(int i = 0; i < mat.length;i++){
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        //  Quantidade de numero negativos
        int count = 0;
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers = "+count);
        
        sc.close();
    }
}
