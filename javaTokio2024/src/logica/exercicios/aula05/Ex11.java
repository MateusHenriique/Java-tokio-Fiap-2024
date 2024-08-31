package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva sua idade em dias: ");
		int idadeEmDias = Integer.parseInt(input.nextLine());
		
		int anos = idadeEmDias / 365;
		int meses = (idadeEmDias % 100) / 30; 
		int dias = (idadeEmDias % 10); 
		
		System.out.println("Voce viveu:");
		System.out.printf("\n%d anos", anos);
		System.out.printf("\n%d meses", meses);
		System.out.printf("\n%d dias", dias);
		
		input.close();
	}
}
