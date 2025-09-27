
package entities;
public class Rectangle {
    public double comprimento;
    public double largura;
    
    public double area(){
        double a;
        return a = comprimento * largura;        
    }
    public double perimeter(){
        double p;
        return p = 2*(comprimento + largura);
    }
    public double diagonal(){
        double d;
        return d = Math.sqrt(Math.pow(comprimento, 2) + Math.pow(largura, 2));
    }
}
