package entities;
public class Draw {
    // Vamos escrever um metodo que recebe o side como parametro
    public void drawSquare(int side){
        //  Garantindo que somente numero positivos funcionam
        if (side <= 0){
            System.out.println("O lado deve ser um numero positivo");
        }
        
        for (int linha = 0; linha < side; linha++){
            for (int coluna = 0; coluna < side; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}
