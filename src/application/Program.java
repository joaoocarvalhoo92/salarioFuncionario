package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Entre com os dados do funcionario : ");
		System.out.print("Nome : ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto : ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto : ");
		funcionario.imposto = sc.nextDouble();
	
	
		System.out.println("Dados do Funcionario: " + funcionario);
	
		System.out.println("Qual o percentual de aumento para o funcionario ? : ");
		double percentage = sc.nextDouble();
		funcionario.aumento (percentage);
		System.out.println("Dados do funcionario: " + funcionario);
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
