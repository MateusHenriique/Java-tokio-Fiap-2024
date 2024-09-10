package logica.exercicios.aula09;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean invalido= false;
		do {
			
			if (invalido == true) {
				System.out.println("Numero invalido Tente Novamente...");
			}
			System.out.print("Digite um numero inteiro: ");
			number = input.nextInt();
			if (number <= 0) {
				invalido = true;
			}
			
		}while (number <= 0);
		
		input.close();
		
		Random rand = new Random();
		float vetor[] = new float[number];
		
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = rand.nextFloat() * 10;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("{ %.2f } \n", vetor[i]);
		}

	
	}
}
