package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1 numero: ");
		int number1 = Integer.parseInt(input.nextLine());
		System.out.print("Digite o 2 numero: ");
		int number2 = Integer.parseInt(input.nextLine());
		
		if (number1 % number2 == 0) {
			System.out.println("Sao Multipos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		input.close();

	}

}
