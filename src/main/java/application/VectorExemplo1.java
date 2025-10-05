package application;
import java.util.Scanner;
import java.util.Locale;
public class VectorExemplo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        int n = sc.nextInt();
        //  Criando vector e instanciando o vector
        double[] vect = new double[n];
        
        //  Recebendo o valor dos vectores
        for(int i = 0; i < n; i++){
            //  Vai alocar o numero a receber no vector na posicao indicada pelo i
            vect[i] = sc.nextDouble();
        }
        //  Inicializamos zero a variavel que ira receber a soma
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            //  Fazemos um laco for para ir incrementando a variavel soma a cada repeticao
            soma += vect[i];
        }
        //  Faz a divisao da soma pelo numero de repeticoes
        double avg = soma / n;
        //  Trinta na tela a media de alturas
        System.out.printf("AVARAGE HEIGHT: %.2f%n", avg);
        
        sc.close();
    }
    
}
