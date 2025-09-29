package application;

import java.util.Scanner;
import java.util.Locale;

public class ProgramFixacao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        
        System.out.print("How many dollars will be bought? ");
        
        System.out.print("Amount to be paid in reais = ");
        
        
        sc.close();
    }
}
