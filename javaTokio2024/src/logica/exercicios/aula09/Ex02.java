package logica.exercicios.aula09;

public class Ex02 {
	public static void main(String[] args) {
		String s = "FIAPTOKIO";
		char c [] = new char [9];
		
		for (int i = s.length() - 1; i >= 0 ; i--) {
			c[i] = s.charAt(i);
		}
		for (char letra : c) {
			System.out.print(letra);
		}
			
	}
}
