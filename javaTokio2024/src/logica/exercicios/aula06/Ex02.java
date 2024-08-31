package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int number1 = Integer.parseInt(input.nextLine());
		System.out.println("Digite outro numero: ");
		int number2 = Integer.parseInt(input.nextLine());
		
		if (number1 > number2) {
			System.out.printf("O Maior numero digitado foi %d", number1);
		}else if (number2 > number1) {
			System.out.printf("O Maior numero digitado foi %d", number2);
		}else {
			System.out.printf("Os numeros digitados sao iguais");
		}
		
		input.close();

	}

}
