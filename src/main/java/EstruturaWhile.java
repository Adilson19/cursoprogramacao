import java.util.Scanner;
public class EstruturaWhile {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int soma = 0;
        //  WHILE - eh recomendada quando nao se sabe previamente a quantidade de repeticoes
        while(x != 0){
            soma += x;
            x = sc.nextInt();
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}
