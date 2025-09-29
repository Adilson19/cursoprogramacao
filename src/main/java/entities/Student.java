package entities;
public class Student {
    public String nome;
    public double notaUm;
    public double notaDois;
    public double notaTres;
    
    public double showNota(){
        return notaUm + notaDois + notaTres;
    }
    
    public boolean alunoClassificacao(){        
        return showNota() >= 60.0;             
    }
    
    public double notaRestante(){
        if(alunoClassificacao()){
            return 0.0;
        }else{
            return 60.0 - showNota();
        }
    }
    
    /*public String toString(){
        return
                "FINAL GRADE = " 
                + 
                String.format("%.2f%n", showNota())
                +
                String.format("%s%n", alunoClassificacao());                
    }*/
}
