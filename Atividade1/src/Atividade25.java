

import br.com.util.Teclado;

public class Atividade25 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte dois n�meros inteiros, e apresente como
		 * resultado se o segundo n�mero informado � ou n�o um divisor do primeiro
		 * n�mero informado
		 */
		int numero1;
		int numero2;
		
		numero1 = Teclado.lerInt("Informe o 1� n�mero: ");
		numero2 = Teclado.lerInt("Informe o 2� n�mero: ");
		
		if (numero1 % numero2 == 0) {
			System.out.println("O segundo n�mero informado � divisor do primeiro:");
		}
		else if (numero1 % numero2 != 0) {
			System.out.println("O segundo n�mero informado n�o � divisor do primeiro:");
		}
	}

}
