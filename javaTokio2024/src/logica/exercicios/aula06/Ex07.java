package logica.exercicios.aula06;

public class Ex07 {

	public static void main(String[] args) {
		int a = 5, b = 7, c = 4, d = 8;

		if ((a <= b) && (b < d)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		if ((a == b) || (c != b)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		if ((d > a) && (c >= b)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		if ((a <= b) || (c <= d)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
		if (((b > c) || (c < a)) && (d <= b)) {
			System.out.println("Verdadeiro");
		}else {
			System.out.println("Falso");
		}
		
	}

}
