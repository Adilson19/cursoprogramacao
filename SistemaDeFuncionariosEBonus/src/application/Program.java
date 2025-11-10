package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Desenvolvedor;
import entities.Funcionario;
import entities.Gerente;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salarioBase = sc.nextDouble();
			System.out.print("Percentual: ");
			Double percentual = sc.nextDouble();
			
			list.add(new Gerente(nome, salarioBase, percentual));
			
			System.out.print("Nome: ");
			String nome1 = sc.nextLine();
			System.out.print("Salario: ");
			Double salarioBase1 = sc.nextDouble();
			
			list.add(new Desenvolvedor(nome1, salarioBase1));
			
			
			for(Funcionario cargo : list) {
				System.out.println(cargo.calcularSalarioTotal());
			}
			

			sc.close();
	}

}
