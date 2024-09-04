package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um nimero para ver a tabuada: ");
		int numero = Integer.parseInt(input.nextLine());
		int multiplica;
		
		for (int c = 0; c <= 25; c++) {
			multiplica = numero * c;
			System.out.printf("%2d X %2d: %3d \n", numero, c, multiplica);
		}
		
		input.close();
	}
}
