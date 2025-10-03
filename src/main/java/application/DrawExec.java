package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Draw;

public class DrawExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Draw meuDesenho = new Draw();
        System.out.println("Digite o tamanho do seu quadrado");
        int lado1 = sc.nextInt();
        System.out.println("Quadrado com lado = " + lado1 + ":");
        meuDesenho.drawSquare(lado1);
       
        System.out.println("\n-------------------------\n");
    }
}
