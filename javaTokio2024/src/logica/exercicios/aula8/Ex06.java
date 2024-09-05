package logica.exercicios.aula8;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int numeroRand, totPar = 0, totImpar = 0, totPrimo = 0, totDivisivel = 0, quebraLinha = 10;
		
		for (int i = 1; i <= 100; i++) {
			numeroRand = rand.nextInt(1, 101);
			if (i == quebraLinha) {
				System.out.printf("%3d \n", numeroRand);
				quebraLinha += 10;
			}else {
				System.out.printf("%3d ", numeroRand);
			}
			
				if (numeroRand % 2 == 0) {
				totPar++;
			}else {
				totImpar++;
			}
			
			for (int j = 1; j <= numeroRand; j++) {
				
				if (numeroRand % j == 0) {
					totDivisivel++;
				}
				
			}
			if (totDivisivel == 2) {
				totPrimo++;
			}
			totDivisivel = 0;
		}
		
		System.out.println(" ");
		System.out.printf("\nForam sorteados %d numeros pares \n", totPar);
		System.out.printf("Foram sorteados %d numeros impares \n", totImpar);
		System.out.printf("Foram sorteados %d numeros primos \n", totPrimo);

	}

}
