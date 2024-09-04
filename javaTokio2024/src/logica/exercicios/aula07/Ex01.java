package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Ola, Mundo!!!");
			System.out.println("Deseja continuar? [sim/nao]");
			String continua = input.nextLine();
			
			while (true) {
				if (continua != "sim" && continua != "nao" && continua.charAt(0) != 's' && continua.charAt(0) != 'n') {
					System.out.println("Resposta invalida, tente novamente...");
					System.out.println("Deseja continuar? [sim/nao]");
					continua = input.nextLine();
				}else {
					break;
				}
			}
			
			if (continua == "nao") {
				break;
			}
		}
		System.out.println("FIM!");
	}

}
