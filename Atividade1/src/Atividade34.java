

import br.com.util.Teclado;

public class Atividade34 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que leia um n�mero n qualquer menor ou igual a 50 e
		 * apresente o valor obtido da multiplica��o sucessiva de n por 3 enquanto o
		 * produto for menor que 250. (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...)
		 * 
		 */
		int n;
		int a;

		n = Teclado.lerInt("Informer um n�meros qualquer menor ou igual a 50 :");

		if (n <= 50) {
			a = n;
			for (int i = 1; a < 250; i++) {

				System.out.println(a);
				a = a * 3;

			}

		} else {
			System.out.println("A valor inserrido � maior que 50.");
		}

	}

}
