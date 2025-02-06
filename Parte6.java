package exercicio3;

import java.util.Locale;

public class Parte6 {

	public static void main(String[] args) {
		
		double x, pi, potencia, area;
		
		Locale.setDefault(Locale.US);
		
		x = 150.00;
		pi = 3.14159;
		potencia = Math.pow(x, 2);
		
		area = pi * potencia;
		
		System.out.printf("A área é: %.4f", area);
		
	}

}
