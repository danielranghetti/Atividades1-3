

import br.com.util.Teclado;

public class Atividade39 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que apresente o valor de uma pot�ncia de uma base
		 * qualquer (Vari�vel b) elevada a um expoente qualquer (Vari�vel e), ou seja,
		 * de b e . (Sem usar Math.pow();)
		 */
		int e;
		int b;
		int res = 1;

		b = Teclado.lerInt("Digite o valor da base: ");
		e = Teclado.lerInt("Didite o valor expoente: ");
		for (int i = 1; i <= e; i++) {
			res = res * b;
		}
		System.out.println(b + " elevado a " + e + " = " + res);

	}

}
