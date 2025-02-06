package exercicio3;

import java.util.Locale;

public class Parte10 {

	public static void main(String[] args) {
		int num, valor;
		double hora, salario;
		Locale.setDefault(Locale.US);
		
		num = 1;
		valor = 200;
		hora = 20.50;
		
		salario = valor * hora;
		
		System.out.println("Funcionário número: " + num);
		System.out.printf("Salário: U$ %.2f%n", salario);
	}

}
