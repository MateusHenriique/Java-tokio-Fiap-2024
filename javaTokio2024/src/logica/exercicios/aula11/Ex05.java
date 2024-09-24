package logica.exercicios.aula11;

import java.util.Scanner;

public class Ex05 extends OperacoesMatematicas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o 1 numero:");
		float valor1 = input.nextFloat();
		System.out.println("Digite o 2 numero:");
		float valor2 = input.nextFloat();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Qual operacao vode deseja realizar [+][-][*][/]: ");
		char operacao = input.next().charAt(0);
		
		input.close();
		
		float resultado = (float) operacoesMatematicas(operacao, valor1, valor2);
		
		if (valor2 == 0 && operacao == '/') {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("A divisao por 0 tende ao infinito.");
		} else {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(resultado);
		}
		
	}

}
