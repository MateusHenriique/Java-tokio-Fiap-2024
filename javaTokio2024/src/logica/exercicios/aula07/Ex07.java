package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual foi a media da turma: ");
		float mediaTurma = input.nextFloat();
		float nota1, nota2, mediaAluno;
		int totMaiorMedia = 0;
		
		for (int c = 1; c <=3; c++) {
			System.out.printf("%d Aluno, primeira nota: \n", c);
			nota1 = input.nextFloat();
			System.out.printf("%d Aluno, segunda nota: \n", c);
			nota2 = input.nextFloat();
			mediaAluno = (nota1 + nota2) / 2;
			if (mediaAluno > mediaTurma) {
				totMaiorMedia ++;
			}
		}
		
		System.out.printf("%d alunos tiveram uma media maior do que a media da sala.", totMaiorMedia);
		input.close();
	}

}
