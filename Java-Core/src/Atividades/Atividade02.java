package Atividades;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print(" Valor do raio : ");
		 double raio = scanner.nextDouble();
		 
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("A area é : %.4f", area);
		 

	}

}
