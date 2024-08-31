package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1416.30;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salario);
		System.out.println(salarioStr);
		
		System.out.println("");
		
		
		String idade = "25";
		int idadeInteiro = Integer.parseInt(idade);
		System.out.println(idadeInteiro);
		
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		System.out.println("digite o preco do produto: ");
		String preco =  input.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		System.out.println(precoFloat);
		
		input.close();
	}

}
