package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Rent;
public class PensionatoExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rent[] vect = new Rent[10];
        
        System.out.print("How many rooms will be rented? ");        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            
            vect[roomNumber] = new Rent(name, email);
        }
        
        System.out.println();
        System.out.println("Busy rooms:");
        for(int i = 0; i < 10; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
            
        }
        /*
        int quartos = 0;
        String[] vectName = new String[quartos];
        String[] vectEmail = new String[quartos];
        int[] vectRoom = new int[quartos];
        
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();
        int indice = 1;
        for(int i = 0; i < vectName.length; i++){
            System.out.printf("Rent #%d:%n", indice);
            System.out.print("Name: ");
            vectName[i] = sc.next();
            System.out.println();
            System.out.print("Email: ");
            vectEmail[i] = sc.next();
            System.out.println();
            System.out.print("Room: ");
            vectRoom[i] = sc.nextInt();
            sc.nextLine();
            indice++;
        }
        
        System.out.print("Busy rooms:");
        for(int i = 0; i < vectName.length; i++){
            if(vectName[i] != null){
                System.out.printf("%d: %s, %s %n", vectRoom[i], vectName[i], vectEmail[i]);
            }
        }*/
        
        
        sc.close();
    }
}
