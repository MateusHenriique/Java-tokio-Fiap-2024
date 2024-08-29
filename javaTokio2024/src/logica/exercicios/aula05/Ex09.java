package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 0 e 999");
		int numero = Integer.parseInt(input.nextLine());
		int unidade = numero%10;
		int dezena = (numero - unidade)%100;
		int centena = ((numero - unidade)-dezena);
		System.out.printf("\nCentena: %d", centena);
		System.out.printf("\ndezena: %d", dezena);
		System.out.printf("\nUnidade: %d", unidade);
		
		input.close();
	}

}
