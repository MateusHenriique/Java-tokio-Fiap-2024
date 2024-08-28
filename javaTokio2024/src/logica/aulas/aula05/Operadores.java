package logica.aulas.aula05;

public class Operadores {
	
	public static void main(String[] args) {
		
		//operadores numericos
		
		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println(num1);
		System.out.println(num2);
		
		float soma = num1 + num2;
		System.out.println("Soma: " + soma);
		
		float sub = num1 - num2;
		System.out.println("Sub: " + sub);
		
		float mult = num1 * num2;
		System.out.println("Multi: " + mult);
		
		float divisao = num1 / num2;
		System.out.println("Divisao: " + divisao);
		
		float resto = num1 % num2;
		System.out.println("resto: " + resto);
		
		// operadores unarios
		
		int numero = 15;
		System.out.println("");
		System.out.println(numero);
		
		numero++;
		System.out.println(numero);
		
		System.out.println(numero++);
		System.out.println(numero);
		
		System.out.println(++numero);
		System.out.println(numero);
		
		System.out.println(numero+5);
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		System.out.println(numero--);
		System.out.println(numero);
		
		System.out.println(--numero);
		System.out.println(numero);
		
		System.out.println(numero-5);
		System.out.println(numero);
		
		//operadores de atribuiçao
		
		int number = 5;
		
		System.out.println(" ");
		System.out.println(number);
		
		number += 8;
		System.out.println(number);
		
		number /= 2;
		System.out.println(number);
	}
}
