package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual a primeira nota do aluno: ");
		float nota1 = Float.parseFloat(input.nextLine());
		
		System.out.print("Qual a segunda nota do aluno: ");
		float nota2 = Float.parseFloat(input.nextLine());
		
		float media = (nota1 + nota2) / 2;
		System.out.printf("A media do aluno foi de %.1f", media);
		
		input.close();
	}
}
