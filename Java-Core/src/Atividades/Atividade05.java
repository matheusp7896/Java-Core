package Atividades;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("codigo da peça 1: ");
		 double codigo = scanner.nextDouble();
		 System.out.print("Numero da peça 1");
		 double peca = scanner.nextDouble();
		 System.out.print("Valor utinario de cada peça 1:");
		 double utinario = scanner.nextDouble();
		 System.out.print("codigo da peça 2: ");
		 double codigo01 = scanner.nextDouble();
		 System.out.print("Numero da peça 2: ");
		 double peca01 = scanner.nextDouble();
		 System.out.print("Valor utinario de cada peça 2: ");
		 double utinario01 = scanner.nextDouble();
		 
		 double resultado =  codigo + peca + utinario + codigo01 + peca01 + utinario01;
		 
		 System.out.println(resultado);

	}

}
