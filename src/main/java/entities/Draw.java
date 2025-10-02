package entities;
public class Draw {
    private String side;
    
    public void setSide(String side){
        this.side = side;
    }
    public String getSide(){
        return side;
    }
    int tamanho = side.length();
    public String drawSquare(){
        for(int i = 0; i <= tamanho; i++){
            for(int j = 0; j <= tamanho; j++){
                return "*";
            }
            return "%n";
        }
    }
    
    public String toString(){
        return "Tamanho do quadrado eh %d"
                +
                tamanho
                +
                drawSquare();
    }
    
}
