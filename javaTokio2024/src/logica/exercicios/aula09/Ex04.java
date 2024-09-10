package logica.exercicios.aula09;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos alunos tm na sala? ");
		int totAlunos = input.nextInt();
		float mediaSala = 0;
		float notaAlunos[] = new float[totAlunos];
		
		for (int i = 0; i < totAlunos; i++ ){
			
			System.out.printf("Digite a nota do %d aluno; ", i + 1);
			notaAlunos[i] = input.nextFloat();
			mediaSala += (notaAlunos[i] / totAlunos); 
			
		}
		
		int totIgualSala = 0, totMaiorSala = 0, totMenorSala = 0;
		
		for (float nota : notaAlunos) {
				
			if (nota > mediaSala) {
				totMaiorSala++;
			}else if (nota == mediaSala) {
				totIgualSala++;
			}else {
				totMenorSala++;
			}
			
		}
		
		System.out.println("\n no total tiverem: ");
		System.out.printf("A media da sala foi:  %.2f", mediaSala);
		System.out.printf("\nno total tiverem %s notas maiores que a media da sala ", totMaiorSala);
		System.out.printf("\n no total tiverem %s notas iguais que a media da sala ", totIgualSala);
		System.out.printf("\n no total tiverem %s notas menores que a media da sala  ", totMenorSala);

	}

}
