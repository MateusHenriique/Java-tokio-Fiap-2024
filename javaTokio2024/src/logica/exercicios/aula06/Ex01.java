package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int number = Integer.parseInt(input.nextLine());
		
		if (number % 2 == 0) {
			System.out.printf("O numero %d e PAR!", number);
		}else {
			System.out.printf("O numero %d e IMPAR!", number);
		}
		
		input.close();
	}
}
