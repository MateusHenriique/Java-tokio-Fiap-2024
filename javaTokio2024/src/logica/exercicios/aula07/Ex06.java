package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("digite um algum numero inteiro:");
		int numero = Integer.parseInt(input.nextLine());
		
		for (int c = 0; c <= numero; c += 2) {
			System.out.printf(" %d", c);
		}
		System.out.printf("\nEsses sao os numeros pares entre o e %d", numero);
		input.close();
	}

}
