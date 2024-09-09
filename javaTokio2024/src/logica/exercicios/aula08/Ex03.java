package logica.exercicios.aula08;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Digite algo: ");
		String algo = input.nextLine();
		
		input.close();
		
		int totMaiusc = 0, totMinusc = 0, totNumeric = 0, totSpace = 0;
		for (int i = 0; i < algo.length(); i++) {
			
			if (algo.charAt(i) >= 'A' && algo.charAt(i) <= 'Z') {
				totMaiusc++;
			}
			
			if (algo.charAt(i) >= 'a' && algo.charAt(i) <= 'z') {
				totMinusc++;
			}
			
			if (algo.charAt(i) >= '0' && algo.charAt(i) <= '9') {
				totNumeric++;
			}
			
			if (algo.charAt(i) == ' ') {
				totSpace++;
			}
		}
		
		System.out.printf("A quantidade de caracteres alfabeticos maiusculos foi: %d \n", totMaiusc);
		System.out.printf("A quantidade de caracteres alfabeticos minusculos foi: %d \n", totMinusc);
		System.out.printf("A quantidade de caracteres numericos foi: %d \n", totNumeric);
		System.out.printf("A quantidade de espaco em branco foi %d \n", totSpace);
		
	}

}
