package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int c = 1;
		int maiorNumero = 0;
		int menorNumero = 0;
		
		while (c <= 12) {
			System.out.printf("Digite o %d numero: ", c);
			int numero = Integer.parseInt(input.nextLine());
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			
			if (c == 1) {
				menorNumero = numero;
		    }else if (numero < menorNumero) {
				menorNumero = numero;
			}
			c++;	
		}
		
		System.out.printf("O maior numero digitado foi %d \n", maiorNumero);
		System.out.printf("O menor numero digitado foi %d", menorNumero);
		
		input.close();
	}

}