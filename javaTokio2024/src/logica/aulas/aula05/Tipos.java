package logica.aulas.aula05;

public class Tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f;
		float preco2 = (float) 12.90;
		System.out.println("float: " + preco);
		System.out.printf("float2: %.2f\n", preco2);
		
		int numerox = 6;
		double numeroXDouble = numerox;
		System.out.println(numerox);
		System.out.println(numeroXDouble);
		
		int numeroInteiro = (int) 10.56;
		Integer numInteiroClass = numeroInteiro;
		System.out.println(numeroInteiro);
		System.out.println(numInteiroClass.getClass());
	}

}
