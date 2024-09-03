package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("digite o ano do seu nascimento: ");
		int anoNascimento = Integer.parseInt(input.nextLine());
		int idade = 2024 - anoNascimento;
		
		if (idade < 16) {
			System.out.println("Voce ainda nao pode votar!");
		}else if (idade >= 16 && idade < 18) {
			System.out.println("O seu voto e opicional");
		}else if (idade > 18 && idade <= 70) {
			System.out.println("O seu voto e obrigatorio!");
		}else {
			System.out.println("O seu voto e opicional");
		}
		
		
		input.close();
	}

}
