package logica.exercicios.aula09;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero inteiro:");
		int n = input.nextInt();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		int numbers[] = new int[n];
		int valor = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("Digite o %d valor: \n", i + 1);
			valor = input.nextInt();
			numbers[i] = valor;
		}
		
		input.close();
		
		int soma = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			soma += numbers[i];
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.printf("A soma dos valores digitados foi %d", soma);
		
	}

}
