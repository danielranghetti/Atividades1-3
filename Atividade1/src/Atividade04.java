

public class Atividade04 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente todos os n�meros
		// divis�veis por 5 que sejam menores que 50

		System.out.println("Os n�meros divis�veis por 5 s�o: ");
		for (int numero = 0; numero < 50; numero++) {
			if (numero % 5 == 0) {
				System.out.println(numero);

			}
		}
	}

}
