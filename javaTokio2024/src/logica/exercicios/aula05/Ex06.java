package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual o nome da peca que voce deseja levar: ");
		String nomePeca1 = input.nextLine();
		System.out.print("Qual a quantidade de pecas:");
		int totPeca1 = Integer.parseInt(input.nextLine()); 
		System.out.print("Qual o preco de cada pecas:");
		float precoPeca1 = Float.parseFloat(input.nextLine()); 
		
		System.out.print("Qual o nome da 2°peca que voce deseja levar: ");
		String nomePeca2 = input.nextLine();
		System.out.print("Qual a quantidade de pecas:");
		int totPeca2 = Integer.parseInt(input.nextLine()); 
		System.out.print("Qual o precos de cada peca:");
		float precoPeca2 = Float.parseFloat(input.nextLine());
		
		System.out.printf("Voce comprou %d %s e %d %s.\n", totPeca1, nomePeca1, totPeca2, nomePeca2);
		
		float totCompra = (precoPeca1 * totPeca1) + (precoPeca2 * totPeca2);
		System.out.printf("o total das suas compras deu: R$%.2f", totCompra);
		
		input.close();
	}
}
