package application;
import java.util.Scanner;
import java.util.Locale;

import java.util.Locale;

public class AlturasVector {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String[] vectNome = new String[n];
        int[] vectIdade = new int[n];
        double[] vectAltura = new double[n];
        
        for(int i = 0; i < vectIdade.length; i++){
            System.out.printf("Dados da %da pessoa: ", i+1);
            System.out.println();
            System.out.print("Nome: ");
            vectNome[i] = sc.next();
            sc.nextLine();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            vectAltura[i] = sc.nextDouble();       
        }
        System.out.println();
        System.out.print("Altura media: ");
        double soma = 0.0;
            
        for(int i = 0; i < vectAltura.length; i++){
            soma += vectAltura[i];
        }        
        double media = soma / vectAltura.length;
        System.out.printf("%.2f%n", media);
        
        System.out.print("Pessoas com menos de 16 anos: ");
        //  Percentagem das pessoas com menos de 16 porcentos
        double cont = 0.0;
        for(int i = 0; i < vectIdade.length; i++){
            int idade = vectIdade[i];
            if(idade < 16){
                cont++;
            }
        }
        
        double perc = cont / vectIdade.length;
        perc *= 100;
        System.out.printf("%.1f", perc);
        System.out.println("%");
        
        //  Nome das Pessoas com menos de 16 anos
        for(int i = 0; i < vectIdade.length; i++){
            int idade = vectIdade[i];
            if(idade < 16){
                System.out.println(vectNome[i]);
            }
        }
        
        sc.close();
    }
        
        
        
    }
