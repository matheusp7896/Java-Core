package Atividades;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Primeiro valor : ");
		 int valor01 = scanner.nextInt();
		 
		 System.out.print("Segundo valor : ");
		 int  valor02 = scanner.nextInt();
		 
		 System.out.print("Terceiro valor : ");
		 int  valor03 = scanner.nextInt();
		 
		 System.out.print("Quarto  valor : ");
		 int  valor04 = scanner.nextInt();
		 
		 System.out.println( valor01*valor02-valor03*valor04);
	}

}
