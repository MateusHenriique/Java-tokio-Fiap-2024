package logica.exercicios.aula8;

public class Ex04 {

	public static void main(String[] args) {
		
		double x = Math.sqrt(81);
		
		double y = ((5 * x) + (2 * Math.pow(x, 2)) + (Math.cbrt(8)) - (Math.PI * x)) / (Math.pow(3, 4) + x);
		
		System.out.printf("y = %f", y);
	}

}
