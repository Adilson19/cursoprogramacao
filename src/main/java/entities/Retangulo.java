package entities;
import util.Ponto;
public class Retangulo {
    private float altura;
    private float largura;
    
    
    //  Construtores
    public Retangulo(){
        
    }/*
    public Retangulo(ponto){
        
    }*/
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
    
    public float calcularArea(float x, float y){
        return (x + y) / 2;
    }
    
    public boolean temInterseccao(){
        return true;
    }
}
