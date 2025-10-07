package application;
import java.util.Scanner;
import java.util.Locale;
public class MaisVelho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] vectNome = new String[n];
        int[] vectIdade = new int[n];
        int cont = 1;
        for(int i = 0; i < vectNome.length; i++){
            System.out.printf("Dados da %da pessoa:%n", cont++);
            System.out.print("Nome: ");
            vectNome[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();           
            
        }
        int maiorIdade = vectIdade[0];        
        int idade = 1;
        
        System.out.print("PESSOA MAIS VELHA: ");                           
        for(int i = 1; i < vectIdade.length; i++){
            if(vectIdade[i] > maiorIdade){
                maiorIdade = vectIdade[i];
                idade = i;
                String maiorIdadeNome = vectNome[idade];
            }
        }
        System.out.print(maiorIdadeNome);
                        
        sc.close();
    }
}
