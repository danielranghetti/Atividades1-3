

import br.com.util.Teclado;

public class Atividade25 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte dois números inteiros, e apresente como
		 * resultado se o segundo número informado é ou não um divisor do primeiro
		 * número informado
		 */
		int numero1;
		int numero2;
		
		numero1 = Teclado.lerInt("Informe o 1ª número: ");
		numero2 = Teclado.lerInt("Informe o 2ª número: ");
		
		if (numero1 % numero2 == 0) {
			System.out.println("O segundo número informado é divisor do primeiro:");
		}
		else if (numero1 % numero2 != 0) {
			System.out.println("O segundo número informado não é divisor do primeiro:");
		}
	}

}
