package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersion3;

public class ProgramCalculatorVersion3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculator calc = new Calculator(); ja nao eh mais necessario instanciar a class
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = CalculatorVersion3.circunference(radius);
        
        double v = CalculatorVersion3.volume(radius);
        
        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorVersion3.PI);
        
        sc.close();
    }
}
        
