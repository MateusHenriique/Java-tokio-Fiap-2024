package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual a primeira nota do aluno: ");
		float nota1 = Float.parseFloat(input.nextLine());
		
		System.out.print("Qual a segunda nota do aluno: ");
		float nota2 = Float.parseFloat(input.nextLine());
		
		double media = ((nota1 * 0.4) + (nota2 * 0.6));
		System.out.printf("A media do aluno foi de %.1f", media);
		
		input.close();
	}
}
