package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double notaA, notaB;
		int i = 0;
		
		do {
			
			if (i > 0) {
				System.out.println(" ");
				System.out.println("Nota invalida tente novamente...");
				System.out.println(" ");
			}
			System.out.print("Digite a primeira nota do aluno: ");
			notaA = input.nextDouble();
			System.out.print("Digite a segunda nota do aluno: ");
			notaB = input.nextDouble();
			i++;
		} while ((notaA < 0 || notaA > 10) || (notaB < 0 || notaB > 10));
		
		double media = (notaA + notaB) / 2;
		System.out.println("A media do aluno foi: " + media);
		
		input.close();
	}
}
