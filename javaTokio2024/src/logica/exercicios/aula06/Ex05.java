package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1 numero: ");
		int number1 = Integer.parseInt(input.nextLine());
		System.out.print("Digite p 2 numero: ");
		int number2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Qual operacao voce deseja fazer: [ + ] [ - ] [ * ] [ / ]");
		char operacao = input.nextLine().charAt(0);
		

		switch (operacao) {
		
			case '+':
				System.out.printf("A Soma de %d e %d é %d", number1, number2, (number1 + number2));
			case '-':
				System.out.printf("A Subtracao de %d e %d é %d", number1, number2, (number1 - number2));
			case '*':
				System.out.printf("A Multiplicacao de %d e %d é %d", number1, number2, (number1 * number2));
			case '/':
				System.out.printf("A Divisao de %d e %d é %d", number1, number2, (number1 / number2));
				
		
				
		}
		
		input.close();
	}

}
