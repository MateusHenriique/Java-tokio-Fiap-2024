package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.print("Qual e o estado de origem do caminhao (entre 1 e 5): ");
		int estadoOrigem = Integer.parseInt(input.nextLine());
		
		while (true) {
			if (estadoOrigem >=1 && estadoOrigem <=5) {
				break;
			}else {
				System.out.println("Codigo de carga invalido!");
				System.out.println("Tente novamente...");
				System.out.print("Qual e o estado de origem do caminhao (entre 1 e 5): ");
				estadoOrigem = Integer.parseInt(input.nextLine());
			}
		}
		
		System.out.print("Qual e o peso da carga do caminhao em toneladas: ");
		Float pesoCarga = Float.parseFloat(input.nextLine());
		
		
		float pesoCargaEmQuilos = pesoCarga * 1000;
		
		System.out.print("Qual e o codigo da carga (entre 10 e 40): ");
		int codigoCarga = Integer.parseInt(input.nextLine());
		
		float valorCarga;
		while (true) {
			if (codigoCarga >= 10 && codigoCarga <=20) {
				valorCarga = pesoCargaEmQuilos * 100;
				break;
			}else if (codigoCarga > 20 && codigoCarga <=30) {
				valorCarga = pesoCargaEmQuilos * 250;
				break;
			}else if (codigoCarga > 30 && codigoCarga <=40) {
				valorCarga = pesoCargaEmQuilos * 300;
				break;
			}else {
				System.out.println("Codigo de carga invalido!");
				System.out.println("Tente novamente...");
				System.out.print("Qual e o codigo da carga (entre 10 e 40): ");
				codigoCarga = Integer.parseInt(input.nextLine());
			}
		}
		
		float valorImposto = 0;
		if (estadoOrigem == 1) {
			valorImposto = (valorCarga / 100) * 35;
		}else if (estadoOrigem == 2) {
			valorImposto = (valorCarga / 100) * 20;
		}else if (estadoOrigem == 3) {
			valorImposto = (valorCarga / 100) * 15;
		}else if (estadoOrigem == 4) {
			valorImposto = (valorCarga / 100) * 5;
		}else if (estadoOrigem == 5) {
			valorImposto = 0;
		}
		
		float totValorTransportado = valorCarga + valorImposto;
		System.out.printf("O peso da carga do caminhão convertido em quilos e: %.1f\n", pesoCargaEmQuilos);
		System.out.printf("O preco da carga do caminhao e: R$.2%f\n", valorCarga);
		System.out.printf("O valor de imposto a ser cobrado é: R$%.2f\n", valorImposto);
		System.out.printf("O valor total transportado pelo caminhao e: R$%.2f\n", totValorTransportado);

		input.close();
	}

}
