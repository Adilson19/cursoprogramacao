package application;
import java.util.Scanner;
import java.util.Locale;
public class PensionatoExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
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
        }
        
        
        sc.close();
    }
}
