

import br.com.util.Teclado;

public class Atividade28 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte 3 valores (variáveis a,b,e,c) e ao final
		 * apresente - os dispostos em ordem crescente
		 */
		int a;
		int b;
		int c;
		int aux;

		a = Teclado.lerInt("Informe o valor de a:");
		b = Teclado.lerInt("Informe o valor de b:");
		c = Teclado.lerInt("Informe o valor de c:");
		
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		if (a > c) {
			aux = a;
			a = c;
			c = aux;
		}
		if (b > c ) {
			aux = b;
			b = c;
			c = aux;
		}
		System.out.println("Os números em ordem crescente são: "
				+ a + "-" + b + "-" + c);
	}

}
