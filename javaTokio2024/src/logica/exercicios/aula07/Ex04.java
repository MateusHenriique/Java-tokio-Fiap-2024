package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		
		for (int c = 1; c <= 10; c++) {
			System.out.printf("Digite o %d valor: ", c);
			valor = Integer.parseInt(input.nextLine());
			soma += valor;
		}
		
		System.out.printf("A soma de todos valores digitados e %d", soma);
		input.close();
	}

}
