package logica.exercicios.aula8;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);
		
		switch (diaDaSemana) {
			
			case 1:
				System.out.println("Hoje e Domingo!!");
				break;
				
			case 2:
				System.out.println("Hoje e Segunda-feira!");
				break;
				
			case 3:
				System.out.println("Hoje e Terca-feira, e tera feira na rua!");
				break;
				
			case 4:
				System.out.println("Hoje e Quarta-Feira");
				break;
				
			case 5:
				System.out.println("Hoje e Qinta-feira");
				break;
				
			case 6:
				System.out.println("Hoje e Sexta-feirs, SEXTOUUU!!!");
				break;
				
			case 7:
				System.out.println("Hoje e SabadoS");
				break;
		}
		
	}

}
