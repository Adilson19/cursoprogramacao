package application;
import entities.Student;
import java.util.Scanner;
import java.util.Locale;
public class StudentExec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        student.nome = sc.nextLine();
        student.notaUm = sc.nextDouble();
        student.notaDois = sc.nextDouble();
        student.notaTres = sc.nextDouble();
        
        System.out.println(student);               
        sc.close();
    }
}
