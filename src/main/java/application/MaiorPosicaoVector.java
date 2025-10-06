package application;
import java.util.Locale;
import java.util.Scanner;
public class MaiorPosicaoVector {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double [] vectMaior = new double[n];
        
        for(int i = 0; i < vectMaior.length; i++){
            System.out.print("Digite um numero: ");
            vectMaior[i] = sc.nextDouble();
        }
        
        double maiorValor = vectMaior[0]; // Começa com o primeiro elemento
        int pos = 0;                     // Sua posição inicial é 0
        // Comece o loop em i = 1
        
        // O loop começa no índice 1, pois já checamos o índice 0 (Corrigido o Erro 2)
        // A lógica de comparação agora é correta (Corrigido o Erro 1)
        for(int i = 1; i < vectMaior.length; i++){
            if(vectMaior[i] > maiorValor){
                maiorValor = vectMaior[i];
                pos = i; // Armazena a posição correta (Corrigido o Erro 3)
            }            
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);        
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", pos); 
        
        sc.close();
    }
}
