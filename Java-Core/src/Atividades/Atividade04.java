package Atividades;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Numero de funcionarios : ");
		 double funcionarios = scanner.nextDouble();
		 System.out.print("Numero de horas trabalhadas : ");
		 double horas = scanner.nextDouble();
		 System.out.print("valor da hora trabalhada : ");
		 double valor = scanner.nextDouble();
		 
		 System.out.println("funcionarios" + funcionarios );
		 System.out.println("Salario " + horas*valor );
		 
		 

	}

}
