package logica.exercicios.aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList <String> nomes = new ArrayList<>();
		String resposta = "";
		
		while (true) {
			System.out.println("Digite o nome da pessoa: [enter para finalizar]");
			resposta = input.nextLine();
			
			input.close();
			
			if (!resposta.isEmpty()) {
				nomes.add(resposta);
			}else {
				break;
			}
			
		}
		
		for (int i = nomes.size() -1; i >= 0 ; i--) {
			System.out.println(nomes.get(i));
		}
	}
}
