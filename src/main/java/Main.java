import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        String dia;
        
        //  Estrutura SWITCH-CASE
        switch(x){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "Valor Invalido";
                break;            
        }
        System.out.println("Dia da Semana: " + dia);
        sc.close();
        
        //  Estrutura IF-ELSE
        /*
        if(x == 1){
            dia = "domingo";
        }else if (x == 2){
            dia = "segunda";
        }else if (x == 3){
            dia = "terca";
        }else if (x == 4){
            dia = "quarta";
        }else if (x == 5){
            dia = "quinta";
        }else if (x == 6){
            dia = "sexta";
        }else if (x == 7){
            dia = "sabado";
        }else{
            dia = "invalido";
        }
        
        System.out.println("Dia da semana: " + dia);
        
        
        
        sc.close();*/
        
        /*
            operadores de atribuicao cumulativas *= ; += ; -= ; %=
        int minutos = sc.nextInt();
        
        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2;
        }
        
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
                
        sc.close();*/
        
        
        
        
        
        //  Estrutura condicional simples
        /*
        Scanner sc = new Scanner(System.in);
        int hora;
        
        System.out.println("Quantas horas?");
        hora = sc.nextInt();
        
        if( hora < 12 ){
            System.out.println("Bom dia");
        }
        else{
            if(hora < 18){
                System.out.println("Boa tarde");
            }else{
                    System.out.println("Boa noite!");
                }
        }
        
        sc.close();*/
        
        /*
        double a = 4.0;
        double b = 9.0;
        double c = -4.0;
        double delta;
        double x1;
        double x2;
        
        delta = Math.pow(b, 2.0) - 4 * a * c;
        
        x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
        System.out.printf("%.2f%n", x1);
        System.out.printf("%.2f%n", x2);*/
        
        
        /*
        //  EXERCICIO DE FUNCOES MATEMATICAS 1
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);*/
        
        /*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        int x;
        String s1, s2, s3;
        //  nextLine -  comando usado para ler a linha inteira
        x = sc.nextInt();// Ao apertar o enter da uma quebra de linha
        //  Simplismente para consumir o espaco
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        
        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/
        
        
        
        
        
        //  ENTRADA DE DADOS EM JAVA
        // Scanner - comando utilizado para fazer leitura de dados em Java
        // sc.nextInt - para numeros inteiros
        // sc.next - para strings
        // sc.nextDouble - para numeros com virgula
        
        //  Declarando a variavel responsavel por armazenar os dados
        //Locale.setDefault(Locale.US);
        //Scanner sc = new Scanner(System.in);
        // Declarando uma variavel
        //int x;
        //double x;
        //char x;
        
        // Para ler varios dados de uma so vez separados por espaco
        /*String x;
        int y;
        double z;
        
        //  Recebendo varios elementos
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        
        //  Imprimindo varios elementos na tela
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/
        
        
        // Recebendo um valor
        // com double pedira a localidade do sistema
        //x = sc.nextDouble(); 
        //x = sc.next().charAt(0);
        //  Verificando se realmente funcionou
        //System.out.println("Voce digitou: " + x);
        
        //sc.close();
        
        /*
        int y = 32;
        double x = 10.35784;
        // String nome para depois o sistema retornar
        String nome = "Adelino";
        int idade = 25;
        double renda = 50000.0;
        //  Exemplo da Tarefa
        String product1 = "Computer";
        String product2 = "Office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        
        System.out.println(y);
        System.out.println(x);
        // "%.2f" -> representa o numero de casas decimais apos a virgula 
        // %n representa o paragrafo apos as casas
        System.out.printf("%.2f%n", x);
        // Imprimindo com 4 casas decimais
        System.out.printf("%.4f%n", x);
        // Para considerar o separador dos USA
        //Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Ola  mundo! Sousa");
        // Concatenando elementos
        System.out.println("RESULTADO = " + x + " METROS");
        // Outra maneira de concatenar
        System.out.printf("RESULTADO = %.2f metros%n", x);
        // Exemplo de concatenacao que envolve 3 variaveis
        System.out.printf("%s tem %d anos e ganha KZ %.2f KWANZA%n", nome, idade, renda);
        
        System.out.printf("Products:%n%s, wich price is $ %.2f %n%s, which price is $ %.2f %n%nRecord: %d years old, code %d and gender: %s %n%nMeasue with eight decimal places: %.8f %nRouded (three decimal places): %.3f %n", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        */
        
        
        
        //  Processamento de dados em JAVA, Casting
        //  Exemplo 1
        /*
        int x, y;
        
        x = 5;
        
        y = 2 * x;
        
        System.out.println(x);
        System.out.println(y);*/
        
        //  Exemplo 2
        /*
        int x;
        
        double y;
        
        x = 5;
        
        y = 2 * x;
        
        System.out.println(x);
        System.out.println(y);*/
        
        //  Exemplo 3
        /*
        double b, B, h, area;
        
        // Para double use: .0
        // Para float use: f
        
        b = 6.0;
        B = 8.0;
        h = 5.0;
        
        area = (b + B) / 2.0 * h;
        
        System.out.println(area);*/
        
        //  Exemplo 4
        /*
        int a, b;
        double resultado;
        
        a = 5;
        b = 2;
        
        //  Casting = conversao explicita no Java
        resultado = (double) a / b;
        
        System.out.println(resultado);*/
        
        //  Exemplo 5
        /*
        double a;
        int b;
        
        a = 5.0;
        //  Casting
        b = (int) a;
        
        System.out.println(b);*/
        
        
    }
}
