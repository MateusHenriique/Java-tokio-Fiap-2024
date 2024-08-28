package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean verificaEmail = true;
		boolean verificaSenha = true;

		boolean logicaE = verificaEmail && verificaSenha;
		System.out.println(logicaE);
		
		boolean logicaOu = false || true;
		System.out.println(logicaOu);
		
		boolean negacao = !false;
		System.out.println(negacao);
	}

}
