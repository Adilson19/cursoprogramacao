package application;
import java.util.Scanner;
import java.util.Locale;

import entities.Banco;

public class BancoExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        //  Para consumir a string vazia
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        
        Banco banco = new Banco(accountNumber, name, response);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");  
            double initialValue = sc.nextDouble();
            banco.setInitialValue(initialValue);
        }else{
            banco.setInitialValue(0);
        }
        System.out.println();
        System.out.printf("Account data: %n");
        System.out.printf("Account %d , Holder: %s, Balance: $ %.2f", banco.getAccountNumber(), banco.getName(), banco.getInitialValue());
        System.out.println();
        
        System.out.print("Enter a deposit value: ");
        double initialValue = sc.nextDouble();
        banco.deposit(initialValue);
        sc.nextLine();
        System.out.println();
        System.out.println("Updated account data:");
        System.out.printf("Account data: %n");
        System.out.printf("Account %d , Holder: %s, Balance: $ %.2f", banco.getAccountNumber(), banco.getName(), banco.getAccountBalance());
        System.out.println();
        
        System.out.print("Enter a withdraw value: ");
        banco.sake(initialValue);
        sc.nextLine();
        System.out.println("Updated account data:");
        System.out.printf("Account data: %n");
        System.out.printf("Account %d , Holder: %s, Balance: $ %.2f", banco.getAccountNumber(), banco.getName(), banco.getAccountBalance());
        System.out.println();
        
        sc.close();
    }
}
