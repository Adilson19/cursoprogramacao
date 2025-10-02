package entities;
public class Retangulo {
    private float altura;
    private float largura;
    
    
    //  Construtores
    public Retangulo(float altura, float largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    //  Getters e Setters
    public void setAltura(float altura){
        this.altura = altura;
    }
   
    public float getAltura(){
        return altura;
    }
    
    public void setLargura(float largura){
        this.largura = largura;
    }
    
    public float getLargura(){
        return largura;
    }
}
