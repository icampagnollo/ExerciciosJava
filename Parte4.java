package exercicio3;

import java.util.Locale;

public class Parte4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x, pi, area, potenciacao;
		
		x = 2;
		pi = 3.14159;
		
		potenciacao = Math.pow(x, 2);
		
		area = pi * potenciacao;
		
		System.out.printf("A = %.4f%n", area);

	}

}
