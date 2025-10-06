package application;
import java.util.Locale;
import java.util.Scanner;
import entities.ProductVector;

public class VectorExemplo2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        //  Criar vector de n productos num Objeto de Class
        ProductVector[] vect = new ProductVector[n];
        
        //  Para instanciar cada elemento do Objecto
        for(int i = 0; i < vect.length; i++){
            //  Para consumir a quebra de linha
            sc.nextLine();
            //  Recebi o nome
            String  name = sc.nextLine();
            //  Recebe o preco
            double price = sc.nextDouble();
            //  Instancia o nome e o preco no vector
            vect[i] = new ProductVector(name, price);
        }
        
        //  Media dos precos
        //  Instanciando a soma com zero
        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){
           //   Para fazer a soma no vector, colocamos o getPrice para pegar o preco
           soma += vect[i].getPrice();
        }
        double avg = soma / vect.length;
       
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        
        sc.close();
    }
}
