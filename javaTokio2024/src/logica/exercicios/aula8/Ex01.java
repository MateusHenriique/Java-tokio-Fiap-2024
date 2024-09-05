package logica.exercicios.aula8;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		int horas = calendar.get(Calendar.HOUR);
		int minutos = calendar.get(Calendar.MINUTE);
		System.out.println("Digite o seu nome");
		String nome = input.next();
		
		System.out.printf("Ola, %s agora sao %d : %d", nome, horas, minutos);
		
		input.close();
	}

}
