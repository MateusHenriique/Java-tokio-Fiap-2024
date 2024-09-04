package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int n = input.nextInt();
		
		System.out.println(n + " 1 = " + (n * 1));
		System.out.println(n + " 2 = " + (n * 2));
		System.out.println(n + " 3 = " + (n * 3));
		System.out.println(n + " 4 = " + (n * 4));
		
		input.close();
	}

}
