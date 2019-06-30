

import br.com.util.Teclado;

public class Atividade18 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um número, 
		 * e apresente como resposta se o referi do número é par ou é ímpar*/
		
		int numero;
		
		numero = Teclado.lerInt("Digite o número para saber se ele é par ou impar: ");
		
		if (numero % 2 == 0) {
			System.out.println("O número informado é par");
		}else if (numero != 0) {
			System.out.println("o número informado é impar");
		}

	}

}
