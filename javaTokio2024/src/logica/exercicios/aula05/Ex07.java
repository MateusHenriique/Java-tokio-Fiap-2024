package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Qual o valor do produto: ");
		float valor = Float.parseFloat(input.nextLine());
		System.out.print("Qual o valor que foi pago do produto: ");
		float pago = Float.parseFloat(input.nextLine());
		float troco = pago - valor;
		
		if (troco < 0) {
			System.out.printf("Voce esta devendo R$%.2f PAGUE JA!!", troco);
		}else {
			System.out.printf("O troco sera de R$%.2f", troco);
		}
		input.close();
	}
}
