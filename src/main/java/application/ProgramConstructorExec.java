package application;

import java.util.Scanner;
import java.util.Locale;
import entities.ProductConstructor;

public class ProgramConstructorExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        // Recebe uma variavel temporaria
        String name = sc.nextLine();
        System.out.print("Price: ");
        //  Recebe uma variavel temporaria
        double price =  sc.nextDouble();
        /*  Apagamos as linhas que pede para digitar a quantidade em stock
        System.out.println("Quantity in stock: ");
        //  Recebe uma variavel temporaria
        int quantity = sc.nextInt();*/
        //  Apos preencher todas variaveis so assim podemos instanciar O Objeto
        //  Colocamos somente dois parametros
        ProductConstructor product = new ProductConstructor(name, price);
        
        product.setName("computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);//    Alterar - setPrice
        System.out.println("Updated price: " + product.getPrice());//   Acessar - getPrice
        
        System.out.println();
        System.out.println("Product data: "+ product);
        
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        //  Colocamos o int antes do nome da variavel para demostrar o tipo de dado que essa variavel irah receber
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        
        sc.close();
    }
}
