package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("digite um numero");
		numero = input.nextInt();
		soma = soma + numero;
		
		System.out.println(" ");
		System.out.println("variavel soma agora " + soma);
		
		System.out.println("digite um numero");
		numero = input.nextInt();
		soma += numero;
		
		System.out.println(" ");
		System.out.println("variavel soma agora " + soma);
		
		System.out.println("digite um numero");
		numero = input.nextInt();
		soma += numero;
		
		System.out.println("A soma e:" + soma);
		
		input.close();
	}

}
