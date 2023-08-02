package Variaveis;

public class operadores {

	public static void main(String[] args) {
		//operador unário 01 ++ e --
		
		int preco = 10;
		System.out.println(preco);
		System.out.println(preco++);
		System.out.println(++preco);
		System.out.println(preco--);
		System.out.println(--preco);
		
		//pperador unario 02 (operacoes)
		
		int valor01 = 10;
		int valor02 = 10;
		int valor03 = 2;
		
		valor03 = valor01++;
		System.out.println("valor de valor03 é:" + valor03);
		
		System.out.println(valor01++ + ++valor01);
		System.out.println(valor02++ + valor02++);
		System.out.println(valor02++ + ++valor01);
	}

}
