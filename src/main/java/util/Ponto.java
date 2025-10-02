package util;
public class Ponto {
    private float x;
    private float y;
    
    public Ponto(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public Ponto(){
        
    }
    
    public void setX(float x){
        this.x = x;
    }
    public float getX(){
        return x;
    }        
    
    public void setY(float y){
        this.y = y;
    }
    public float getY(){
        return y;
    }
}
