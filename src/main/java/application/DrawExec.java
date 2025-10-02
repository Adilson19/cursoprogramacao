package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Draw;

public class DrawExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do seu quadrado");
        Draw draw = new Draw();
        draw.setSide = sc.nextString();
       
    }
}
