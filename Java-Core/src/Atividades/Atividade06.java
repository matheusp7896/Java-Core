package Atividades;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("lado A: ");
		 double ladoa = scanner.nextDouble();
		 System.out.print("lado B: ");
		 double ladob = scanner.nextDouble();
		 System.out.print("lado C: ");
		 double ladoc = scanner.nextDouble();
		 
		 double a = Math.pow(ladoa, 2)* ladoc;
		  double b = Math.PI ;
		  double c = Math.pow(ladoa, 2)+ Math.pow(ladob,2)* ladoc;
		  double d = ladob;
		  double e = ladoa + ladob;
		  
		  System.out.println("triangulo:" + a);
		  System.out.println("Circulo:" + b);
		  System.out.println("trapezio:" + c);
		  System.out.println("quadrado:" + d);
		  System.out.print("retangulo" + e);
				  

	}

}
