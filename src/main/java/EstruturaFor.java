import java.util.Scanner;
public class EstruturaFor {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        //  Quando se sabe previamente a quantidade de repeticoes ou intervalo de valores
        int soma = 0;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);
        
        sc.close();
    }
}
