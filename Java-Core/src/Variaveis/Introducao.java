package Variaveis;

public class Introducao {

	public static void main(String[] args) {
		/// Variaveis locais.
		int lapis = 0;
		float leite =  4, agua=5;
		double cafe = 4.5;
        System.out.println(lapis);
        
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        
        System.out.printf("resultado = %.2f metros%n", x);
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0f;
        System.out.printf("%s tem %danos e ganha RS %,2f reais%n", nome, idade,renda);
	}

}
