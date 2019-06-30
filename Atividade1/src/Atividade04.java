

public class Atividade04 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente todos os números
		// divisíveis por 5 que sejam menores que 50

		System.out.println("Os números divisíveis por 5 são: ");
		for (int numero = 0; numero < 50; numero++) {
			if (numero % 5 == 0) {
				System.out.println(numero);

			}
		}
	}

}
