package entities;
public class Draw {
    private int side;
    
    public void setSide(int side){
        this.side = side;
    }
    public int getSide(){
        return side;
    }
    
    public void tamanho(int tamanho){
        //this.tamanho = tamanho;
    }
    
    public String drawSquare(){
        return "*";
    }
    /*
    public String toString(){
        return "Tamanho do quadrado eh %d"
                +
                tamanho
                +
                drawSquare();
    }*/
    
}
