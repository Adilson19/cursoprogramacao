package entities;
public class Student {
    public String nome;
    public double notaUm;
    public double notaDois;
    public double notaTres;
    
    public double showNota(){
        return notaUm + notaDois + notaTres;
    }
    
    public String alunoClassificacao(){
        if((notaUm + notaDois + notaTres) > (notaUm + notaDois + notaTres) * 0.60){
            return "PASS";
        }else if ((notaUm + notaDois + notaTres) < (notaUm + notaDois + notaTres) * 0.60){
            return 
                    "FAILED %n";
        }
        return 
                "MISSING " 
                + (notaUm + notaDois + notaTres - (notaUm + notaDois + notaTres) * 0.60) 
                + " POINTS";
    }
    
    public String toString(){
        return
                "FINAL GRADE = " 
                + 
                String.format("%.2f%n", showNota())
                +
                String.format("%s%n", alunoClassificacao());                
    }
}
