

public class Atividade37 {

	public static void main(String[] args) {
		/*
		 * Elaborar um programa que apresente no final a soma dos valores pares
		 * existentes na faixa de 0 at� 500. Utilize um la�o que efetue a varia��o de 2
		 * em 2
		 */

		int soma = 0;
		for (int i = 0; i <= 500; i++) {
			soma += i;
			i++;
		}
		System.out.println("A soma dos valores pares entre 0 at� 500 �: " + soma);
	}

}
