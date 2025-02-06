package exercicio3;

import java.util.Locale;

public class Parte11 {

	public static void main(String[] args) {
		int num, valor;
		double hora, salario;
		Locale.setDefault(Locale.US);
		
		num = 6;
		valor = 145;
		hora = 15.55;
		
		salario = valor * hora;
		
		System.out.println("Funcionário número: " + num);
		System.out.printf("Salário: U$%.2f%n", salario);

	}

}
