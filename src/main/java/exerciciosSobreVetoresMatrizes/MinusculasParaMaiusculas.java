package exerciciosSobreVetoresMatrizes;
import java.util.Scanner;
    public class MinusculasParaMaiusculas {        
        // Definimos uma constante para o tamanho máximo da cadeia de caracteres
        private static final int TAMANHO_MAXIMO = 20;
        public static void main(String[] args){
    
        // Objeto Scanner para ler a entrada do utilizador
        Scanner scanner = new Scanner(System.in);
        String entrada;

        System.out.printf("Introduza os caracteres (max. %d, termina com Enter): ", TAMANHO_MAXIMO);

        // 1. Leitura da Consola:
        // Lemos a linha completa (até '\n')
        entrada = scanner.nextLine();

        // 2. Limitação do Tamanho:
        // Garantimos que a string não exceda o tamanho máximo de 20 caracteres.
        // O método 'substring' cria uma nova string com os primeiros 20 caracteres.
        if (entrada.length() > TAMANHO_MAXIMO) {
            entrada = entrada.substring(0, TAMANHO_MAXIMO);
            // Poderia-se adicionar um aviso aqui, mas o requisito é apenas limitar
        }

        // 3. Conversão:
        // O método toUpperCase() é o método mais simples e direto em Java para
        // converter todos os caracteres alfabéticos de uma String para maiúsculas.
        String resultado = converterParaMaiusculas(entrada);

        // 4. Impressão do Resultado:
        System.out.println("Resultado da conversao: " + resultado);

        // Fechar o Scanner para liberar recursos
        scanner.close();
    }

    /**
     * Função: converterParaMaiusculas
     * Descrição: Converte a String de entrada para maiúsculas.
     * Parâmetros:
     * - str: A String a ser convertida.
     * Retorno: A nova String em maiúsculas.
     */
    public static String converterParaMaiusculas(String str) {
        // O Java lida automaticamente com caracteres especiais (não alfabéticos)
        // e apenas converte as letras minúsculas.
        return str.toUpperCase();    
}
        
        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        int n = 20;
        String[] vectCaracter = new String[n];
        String toUpperCase;
        
        System.out.print("Introduza os caracteres: ");
        for(int i = 0; i < vectCaracter.length; i++){
            vectCaracter[i] = sc.next();
            toUpperCase = vectCaracter[i].toUpperCase();            
        }
        
        System.out.print("Resultado da conversão: ");
        for(int i = 0; i < vectCaracter.length; i++){
            System.out.print(vectCaracter[i]);
        }
        
        sc.close();
    }*/
}
