

import br.com.util.Teclado;

public class Atividade24 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um n�mero e exiba a informa��o de que
		 * ele � positivo, negativo ou nulo.
		 */
		double numero;

		numero = Teclado.lerDouble("Informe um n�mero para saber se ele � positivo, negativo ou nulo: ");

		if (numero < 0) {
			System.out.println("O numero informado � negativo: " + numero);
		} else if (numero > 0) {
			System.out.println("O numero informado � positivo: " + numero);
		} else if (numero == 0) {
			System.out.println("O numero informado � nulo: " + numero);
		}

	}
}