package exercicio3;

import java.util.Locale;

public class Parte5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double x, pi, potencia, area;
		
		x = 100.64;
		pi = 3.14159;
		potencia = Math.pow(x, 2);
		area = pi * potencia;
		
		System.out.printf("A área do círculo é: %.4f", area);

	}

}
