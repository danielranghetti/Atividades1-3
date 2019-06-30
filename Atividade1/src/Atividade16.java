

import br.com.util.Teclado;

public class Atividade16 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um número. Se este número for maior que
		 * 20, então ele deverá exibir a metade deste número, senão, ele deverá exibir o
		 * número sem alterações.
		 */

		double numero;
		double metade;
		numero = Teclado.lerInt("Digite o numero: ");

		if (numero > 20) {
			metade = numero / 2;
			System.out.println("A metade do número informado é: " + metade);
		} else  {
			System.out.println("O número informado foi: " + numero);
		}

	}

}
