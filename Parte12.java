package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Parte12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, nump1, nump2;
		double val1, val2, total;
		
		cod1 = sc.nextInt();
		nump1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		nump2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		total = nump1 * val1 + nump2 * val2;
		
		System.out.printf("Valor a pagar: R$%.2f%n", total);
		
		sc.close();
		
		
		
		
		
	}

}
