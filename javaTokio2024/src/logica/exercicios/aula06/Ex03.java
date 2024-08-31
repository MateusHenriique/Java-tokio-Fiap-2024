package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		float media = 0f;
		for (int c = 1; c <= 4; c++) {
			System.out.printf("Digite A %d nota do aluno: ", c);
			float nota = Float.parseFloat(input.nextLine());
			media += nota / 4;
		}
		
		if (media >= 7) {
			System.out.printf("A nota media do aluno foi: %.1f ESTA APROVADO!!", media);
		}else if (media >=5 && media < 7) {
			System.out.printf("A nota media do aluno foi: %.1f ESTA RECUPERACAO!!", media);
		}else {
			System.out.printf("A media do aluno foi: %.1f ESTA REPROVADO!!", media);
		}
		
		input.close();
	}
}
