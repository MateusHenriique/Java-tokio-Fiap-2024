package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o comprimento do 1 lado: ");
		float lado1 = Float.parseFloat(input.nextLine());
		
		System.out.println("Digite o comprimento do 2 lado: ");
		float lado2 = Float.parseFloat(input.nextLine());
		
		System.out.println("Digite o comprimento do 3 lado: ");
		float lado3 = Float.parseFloat(input.nextLine());
		
		if (lado1 < lado2 + lado3 && lado2 < lado3 + lado1 && lado3 < lado1 + lado2) {
			
			if ((lado1 * lado1) == ((lado2 * lado2) + (lado3 * lado3))) {
				System.out.println("TRIANGULO RETANGULO");
				
			}else if ((lado1 * lado1) > ((lado2 * lado2) + (lado3 * lado3))) {
				System.out.println("TRIANGULO OBTUSANGULO");
				
			}else if((lado1 * lado1) < ((lado2 * lado2) + (lado3 * lado3))) {
				System.out.println("TRIANGULO ACUTANGULO");
				
		    }else if (lado1 == lado2 && lado2 == lado3){
				System.out.println("TRIANGULO EQUILATERO");
				
			}else if (lado1 == lado2 || lado2 == lado3) {
				System.out.println("TRIANGULO ISOCELES");
				
			}else {
				System.out.println("TRIANGULO ESCALENO");
			}
		}else {
			System.out.println("NAO FORMA UM TRIANGULO");
		}
		input.close();
	}

}