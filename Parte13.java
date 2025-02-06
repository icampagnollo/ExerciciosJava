package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Parte13 {

	public static void main(String[] args) {
		double a, b, c, tri, cir, tra, qua, ret, pi;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		pi = 3.14159;
		
		
		ret = a * b;
		cir = pi * Math.pow(c, 2);
		tra = ((a + b) * c) / 2;
		qua = Math.pow(b, 2);
		tri = a * c / 2;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", cir);
		System.out.printf("TRAPEZIO: %.3f%n", tra);
		System.out.printf("QUADRADO: %.3f%n", qua);
		System.out.printf("RETANGULO: %.3f%n", ret);
		
		sc.close();
		
		
		
		

	}

}
