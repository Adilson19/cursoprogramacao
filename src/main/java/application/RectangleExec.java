package application;
import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;
//import java.util.Locale;

public class RectangleExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.comprimento = sc.nextDouble();
        rectangle.largura = sc.nextDouble();
        
        double areaRectangle = rectangle.area();
        double perimeterRectangle = rectangle.perimeter();
        double diagonalRectangle = rectangle.diagonal();
        
        System.out.printf("AREA = %.2f%n", areaRectangle);
        System.out.printf("PERIMETER = %.2f%n", perimeterRectangle);
        System.out.printf("DIAGONAL = %.2f%n", diagonalRectangle);
        
        sc.close();
    }
}
