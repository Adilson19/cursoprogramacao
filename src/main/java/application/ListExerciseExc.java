package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//import entities.EmployeeList;

public class ListExerciseExc {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        //EmployeeList employee = new EmployeeList();
        List<String> list = new ArrayList<>();
        int cont = 1;
        for(int i = 0; i < n; i++){
            System.out.printf("Employee #%d", cont++);
            System.out.print("Id: ");
            //list.add(i, EmployeeList.setName());
            System.out.print("Name");
            System.out.print("Salary");
        }
        
        System.out.print("Enter the employee id that will have salary increase : ");
        System.out.print("Enter the percentage: ");
        
        System.out.println();
        System.out.println("List of employees:");
        
        sc.close();
    }
}
