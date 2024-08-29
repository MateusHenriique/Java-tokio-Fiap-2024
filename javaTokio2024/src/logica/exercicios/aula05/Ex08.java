package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor em reais: R$");
		float reais = Float.parseFloat(input.nextLine());
		System.out.printf("\nSeu valor em Dolar e: USD %.2f", reais/5,62);
		System.out.printf("\nSeu valor em Euro e: EUR %.2f", reais/6.22);
		System.out.printf("\nSeu valor em Peso Argentino e: ARS %.2f", 0.0059*reais);
		System.out.printf("\nSeu valor em Libras Esterlinas e: GBT %.2f", reais/7.40);
		System.out.printf("\nSeu valor em Ienes e: JPY %.2f", 0.039*reais);
		
		input.close();
	}
}
