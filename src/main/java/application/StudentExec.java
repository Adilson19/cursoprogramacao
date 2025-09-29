package application;
import entities.Student;
import java.util.Locale;
import java.util.Scanner;

class StudentExec {
    public static void main(String[] args) {
        
        // Configura o Locale padrão para US para garantir que o ponto (.)
        // seja usado como separador decimal na entrada e saída (similar ao CultureInfo.InvariantCulture).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        
        // Solicita o nome do aluno
        student.nome = sc.nextLine();        
        // Lê as notas (double)
        student.notaUm = sc.nextDouble();
        student.notaDois = sc.nextDouble();
        student.notaTres = sc.nextDouble();
        
        // Exibe a nota final formatada com 2 casas decimais (equivalente a "F2")
        System.out.println("NOTA FINAL = " 
            + String.format("%.2f", student.showNota()));
        
        // Verifica a aprovação e exibe o resultado
        if (student.alunoClassificacao()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            
            // Exibe a nota restante formatada com 2 casas decimais
            System.out.println("MISSING " 
                + String.format("%.2f", student.notaRestante())
                + " POINTS");
        }
        
        sc.close();
    }
}
