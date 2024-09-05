package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 0 , numero = 0;
		do {
			
			if (i > 0) {
				System.out.println("numero invalido tente novamente...");
			}
			System.out.println("Digite um numero: ");
			numero = input.nextInt();
			i++;
			
		} while (numero < 0);
		
		int soma = 0;
		for (i = 1; i <= numero; i++) {
				if (i == numero) {
					System.out.printf("%d = ", i);
					soma += i;
				}else {
					System.out.printf("%d + ", i);
					soma += i;
				}
		}
		
		System.out.print(soma);
		
		input.close();
	}

}
