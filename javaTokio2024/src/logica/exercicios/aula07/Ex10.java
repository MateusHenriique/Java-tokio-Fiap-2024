package logica.exercicios.aula07;

class Ex10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 2000; i++) {
			int totDivisiveis = 0;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					totDivisiveis += 1;

				}
				
			}
			if (totDivisiveis == 2) {
				System.out.printf("%d ", i);
			}
		}

	}

}
