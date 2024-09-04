package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Ola, Mundo!!!");
			System.out.println("Deseja continuar? [S/N]");
			char continua = Character.toUpperCase(input.nextLine().charAt(0));
			
			while (true) {
				if (continua != 'S' && continua != 'N') {
					System.out.println("Resposta invalida, tente novamente...");
					System.out.println("Deseja continuar? [S/N]");
					continua = Character.toUpperCase(input.nextLine().charAt(0));
				}else {
					break;
				}
			}
			
			if (continua == 'N') {
				break;
			}
		}
		
		System.out.println("FIM!");
		input.close();
	}
}
