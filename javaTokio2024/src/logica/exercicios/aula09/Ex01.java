package logica.exercicios.aula09;

public class Ex01 {
	public static void main(String[] args) {
		int v [] = {2, 0, 3, 9};
		v[v[2]] = v[v[1]];
		for (int i : v) {
			System.out.println(i);
		}
	}
}
