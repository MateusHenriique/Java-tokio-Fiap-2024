package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" [1] Residencia \n [2] Comercio \n [3] Industria");
		System.out.print("Qual é o tipo de residencia:");
		int tipoResidencia = Integer.parseInt(input.nextLine());
		
		
		System.out.print("Quantos KW/h foram gastos?");
		float kwHora = Float.parseFloat(input.nextLine());
		float fatura = 0f;
		
		if (tipoResidencia == 1) {
			fatura = (float) (kwHora * 0.60);
		}else if (tipoResidencia == 2) {
			fatura = (float) (kwHora * 0.48);
		}else if (tipoResidencia == 3) {
			fatura = (float) (kwHora * 1.29);
		}else {
			System.out.println("Tipo de residencia invalida!");
		}
		
		System.out.printf("O valor da sua conta de luz foi R$%.2f", fatura);
	    input.close();
	}

}
