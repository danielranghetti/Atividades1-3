

public class Atividade43 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente a s�rie de Fibonacci at� o d�cimo
		 * quinto termo. A s�rie de Fibonacci � formada pela sequ�ncia
		 * 1,1,2,3,5,8,13,21,34, ... etc. Ela se caracteriza pela soma de um termo
		 * posterior com seu anterior subsequente.
		 */
		int anterior = 0;
		int posterio = 1;
		int soma;
		
		for (int i = 1; i <= 15; i++) {
			
			
			soma = anterior + posterio;
			anterior = posterio;
			posterio = soma;
			
			System.out.print(anterior + " ");
		}
	}

}
