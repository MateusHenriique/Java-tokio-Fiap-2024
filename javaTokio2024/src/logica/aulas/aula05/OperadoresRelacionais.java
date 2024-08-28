package logica.aulas.aula05;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int num1 = 40;
	
		System.out.println(num1 != 14);
		System.out.println(num1 == 14);
		System.out.println(num1 > 14);
		System.out.println(num1 < 14);
		
		boolean comparacao = num1 > 2;
		System.out.println(comparacao);
		
		String nome1 = "Joana";
		String nome2 = "joana";
		
		System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));
				
	}
}
