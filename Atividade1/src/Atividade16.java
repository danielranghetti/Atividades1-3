

import br.com.util.Teclado;

public class Atividade16 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um n�mero. Se este n�mero for maior que
		 * 20, ent�o ele dever� exibir a metade deste n�mero, sen�o, ele dever� exibir o
		 * n�mero sem altera��es.
		 */

		double numero;
		double metade;
		numero = Teclado.lerInt("Digite o numero: ");

		if (numero > 20) {
			metade = numero / 2;
			System.out.println("A metade do n�mero informado �: " + metade);
		} else  {
			System.out.println("O n�mero informado foi: " + numero);
		}

	}

}
