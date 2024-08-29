package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual e o seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Qual e o seu Genero: ");
		System.out.println("[M] para masculino");
		System.out.println("[F] para feminino ");
		System.out.println("[O] Para Outro ");
		System.out.println("[N] para nao responder: ");
		char genero = input.nextLine().charAt(0);
		
		System.out.printf("\nOla %s! Voce escolheu a seguinte opcao de genero:%c", nome, genero);
		
		input.close();
	}
}
