package logica.exercicios.aula11;

public class OperacoesMatematicas {
	
		static float operacoesMatematicas(char operacao, float valor1, float valor2) {
			float resultado = 0;
			
			if (operacao == '+') {
				resultado = funcaoSoma(valor1, valor2);
			}else if (operacao == '-') {
				resultado = funcaoSubitrai(valor1, valor2);
			}else if (operacao == '*') {
				resultado = funcaoMultiplica(valor1, valor2);
			}else if (operacao == '/') {
				resultado = funcaoDivide(valor1, valor2);
			}
			return resultado;
			
		}
	
		private static float funcaoSoma(float valor1, float valor2) {
			float soma = 0;
			
			soma = valor1 + valor2;
			
			return soma;
		}
		
		private static float funcaoSubitrai(float valor1, float valor2) {
			float subtracao = 0;
			
			subtracao = valor1 - valor2;
			
			return subtracao;
		}
		
		private static float funcaoMultiplica(float valor1, float valor2) {
			float multiplicacao = 0;
			
			multiplicacao = valor1 * valor2;
			
			return multiplicacao;
		}
		
		private static float funcaoDivide(float valor1, float valor2) {
			float divisao = 0;
			
			divisao = valor1 / valor2;
			
			return divisao;
		}
		
		
		
}
