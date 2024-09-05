package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 0, numero = 0;
		
		do {
			
			if (i > 0) {
				System.out.println("numero invalido tente novamente...");
			}
			System.out.print("Digite um numero: ");
			numero = input.nextInt();
			i++;
			
		} while (numero < 0);
		
		input.close();
		System.out.printf("todos os numeros divisiveis por %d sao: ", numero);
		
		for (i = 1; i <= numero; i++) {
			
			if (numero % i == 0) {
				System.out.printf("%d ", i);
			}
		}
		
	}

}
