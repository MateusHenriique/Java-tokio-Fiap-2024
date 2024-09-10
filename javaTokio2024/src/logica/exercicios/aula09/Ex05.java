package logica.exercicios.aula09;

public class Ex05 {

	public static void main(String[] args) {
		
		String mes[] = {"jan", "Fev", "Mar", "Abr", "Mai", "Jun", "jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < 12; i++) {
			System.out.printf("O Mes de %s tem %d dias ao todo.\n", mes[i], dias[i]);
	}
	
	}

}
