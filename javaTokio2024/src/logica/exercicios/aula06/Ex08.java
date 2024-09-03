package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos quilometros foram percorridos com o seu carro? ");
		float kilometros = Float.parseFloat(input.nextLine());
		
		System.out.println("Quantos litros de combustivel foram consumidos pelo percurso? ");
		int litros = Integer.parseInt(input.nextLine());
		float kmPorLitro = kilometros / litros;
		
		System.out.printf("O seu carro anda %.1f por litro\n", kmPorLitro);
		if (kmPorLitro < 8) {
			System.out.print("Esse carro e bebe combustivel heim!!");
		}else {
			System.out.print("Autonomia legal!");
		}
		
		input.close();

	}

}
