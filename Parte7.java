package exercicio3;

import java.util.Locale;

public class Parte7 {

	public static void main(String[] args) {
		int a, b, c, d, prod1, prod2, diferenca;
		
		Locale.setDefault(Locale.US);
		
		a = 5;
		b = 6;
		c = 7;
		d = 8;
		
		prod1 = a * b;
		prod2 = c * d;
		
		diferenca = prod1 - prod2;
		
		System.out.print("Diferença: " + diferenca);

	}

}
