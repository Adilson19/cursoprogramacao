package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Banco;

public class BancoExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter account number: ");

        System.out.print("Enter account holder: ");
        
        System.out.print("Is there an initial deposit (y/n)? ");
        
        System.out.print("Enter initial deposit value: ");
    }
}
