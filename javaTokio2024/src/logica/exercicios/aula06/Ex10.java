package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*Salários até R$ 280,00 (incluindo): aumento de 20%.
		▪ Salários entre R$ 280,00 e R$ 700,00: aumento de 15%.
		▪ Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%.
		▪ Salários de R$ 1500,00 em diante: aumento de 5%.*/
		System.out.print("Digite o salario do fucionario: ");
		float salarioFuncionario = Float.parseFloat(input.nextLine());
		float aumentoSalario = 0f;
		int aumento;
		
		if (salarioFuncionario <= 280) {
			aumentoSalario = (salarioFuncionario/100) * 20;
			aumento = 20;
			
		}else if (salarioFuncionario > 280 && salarioFuncionario <= 700) {
			aumentoSalario = (salarioFuncionario/100) * 15;
			aumento = 15;
			
		}else if (salarioFuncionario > 700 && salarioFuncionario <= 1500) {
			aumentoSalario = (salarioFuncionario/100) * 10;
			aumento = 10;
		}else {
			aumentoSalario = (salarioFuncionario/100) * 5;
			aumento = 5;
		}
		float salarioComAumento = salarioFuncionario + aumentoSalario;
		
		System.out.printf("O salario salario antigo do funcionario era: R$%.2f\n", salarioFuncionario);
		System.out.printf("O funcionario tera um aumento de %d%% que e R$%.2f\n", aumento, aumentoSalario);
		System.out.printf("O ni=ove salario do funcionario sera R$%.2f\n", salarioComAumento);
		
		input.close();
	}

}
