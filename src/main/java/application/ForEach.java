package application;
import java.util.Scanner;
import java.util.Locale;

public class ForEach {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String[] vect = new String[]{"Maria", "Bob", "Alex"};
        
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("-------------------------------------------");
        //  String = porque é um vector de string
        //  obj = porque é um nome dado (apelido)
        //  vect = colecao nesse caso o array
        //  O Laço percorre todos os elementos de vect dando a cada um o nome obj
        for(String obj : vect){
            System.out.println(obj);
        }
        
        sc.close();
    }
}