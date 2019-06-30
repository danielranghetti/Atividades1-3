

import br.com.util.Teclado;

public class Atividade24 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte um número e exiba a informação de que
		 * ele é positivo, negativo ou nulo.
		 */
		double numero;

		numero = Teclado.lerDouble("Informe um número para saber se ele é positivo, negativo ou nulo: ");

		if (numero < 0) {
			System.out.println("O numero informado é negativo: " + numero);
		} else if (numero > 0) {
			System.out.println("O numero informado é positivo: " + numero);
		} else if (numero == 0) {
			System.out.println("O numero informado é nulo: " + numero);
		}

	}
}