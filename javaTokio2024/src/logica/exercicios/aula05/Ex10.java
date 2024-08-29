package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva sua idade Anos: ");
		int anos = Integer.parseInt(input.nextLine());
		System.out.print("Escreva sua idade Meses: ");
		int meses = Integer.parseInt(input.nextLine());
		System.out.print("Escreva sua idade Dias: ");
		int dias = Integer.parseInt(input.nextLine());
		
		int totVida = (anos*365) + (meses * 30) + dias;
		System.out.printf("No total voce viveu %d dias", totVida);
		
		input.close();
	}
}
