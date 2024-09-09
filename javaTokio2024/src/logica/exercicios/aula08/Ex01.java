package logica.exercicios.aula08;

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
		
		if (horas > 6 && horas < 12) {
			System.out.printf("Bom Dia, %s agora sao %d:%d da manha", nome, horas, minutos);
		}else if (horas > 12 && horas < 18) {
			System.out.printf("Boa Tarde, %s agora sao %d:%d da tarde", nome, horas, minutos);
		}else if (horas > 18 && horas <= 23) {
			System.out.printf("Boa Noite, %s agora sao %d:%d da noite", nome, horas, minutos);
		}else {
			System.out.printf("Bom Noite, %s agora sao %d:%d da madrugada", nome, horas, minutos);
		}
		
		input.close();
	}

}
