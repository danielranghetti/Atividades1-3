import br.com.util.Teclado;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente o valor de uma potência de uma base
		 * qualquer elevada a um expoente qualquer, ou seja, de be, onde os valores de
		 * be esão fornecidos pelo usuário, sem utilizar Math.pow()
		 */
		int exp;
		int base;
		int res = 1;

		base = Teclado.lerInt("Digite o valor da base: ");
		exp = Teclado.lerInt("Didite o valor expoente: ");
		for (int i = 1; i <= exp; i++) {
			res = res * base;
		}
		System.out.println(base + " elevado a " + exp + " = " + res);

	}

}
