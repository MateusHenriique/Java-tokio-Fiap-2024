package logica.exercicios.aula09;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int numero = input.nextInt();
		char[] vetorNumero = new char[numero];
		
		for (int i = 0; i < vetorNumero.length; i++) {
			System.out.printf("Digite o %d caractere0", i);
			System.out.print("Digite um charactere");
			vetorNumero[i] = input.next().charAt(0);			
		}
		
		

	}

}
