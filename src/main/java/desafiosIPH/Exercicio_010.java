package desafiosIPH;
import java.util.Scanner;

public class Exercicio_010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double salarioLiquido = 0.0;
        double salarioBruto = 0.0;
        final double PERCENTAGEM = 0.09;
        double desconto;
        String nomeDoFuncionario;
        
        System.out.println("Digite o nome do Funcionario:");
        nomeDoFuncionario = sc.nextLine();
        System.out.println("Digite o Salario Bruto:");
        salarioBruto = sc.nextDouble();
        desconto = salarioBruto * PERCENTAGEM;
        salarioLiquido = salarioBruto - desconto;
        System.out.printf("Sr.(a) %s, o seu Salario Liquido %.2f que sofreu um Desconto de %.2f AKZ%n", nomeDoFuncionario, salarioLiquido, desconto);
        sc.close();
    }
}
