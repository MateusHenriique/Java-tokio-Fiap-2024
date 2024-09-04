package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		
		while (i <= 5) {
			System.out.println("Ola, mundo" + i);
			i++;
		}
		
		System.out.println(" ");
		
		i = 5;
		while (i > 0) {
			System.out.println("Ola, mundo" + i);
			i--;
		}
		
		String jogar = "sim";
		
		while (jogar.equals("sim")) {
			System.out.println("Deseja Jogar Novamente? ");
			jogar = input.nextLine();
		}
		
		System.out.println(" ");
		i = 0;
		while (i < 10) {
			i++;
			
			if (i == 3 || i == 5) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			
			System.out.println("produto" + i);
		} 
		input.close();
	}

}
