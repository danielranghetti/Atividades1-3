
import br.com.util.Teclado;

public class Atividade08 {

	private static int i;

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa,
		 * sexo e idade, e exiba o nome inteiro das pessoas que são do sexo masculino e
		 * possuem 21 anos ou mais
		 */

		String[] nome = new String[20];
		String[] sexo = new String[20];
		int[] idade = new int[20];

		for (int i = 0; i < 2; i++) {

			nome[i] = Teclado.lerTexto("Qual o nome seu nome copleto? ");
			sexo[i] = Teclado.lerTexto("Digite o sexo F/M:");
			idade[i] = Teclado.lerInt("Digite a idade:");

			if (sexo[i].equalsIgnoreCase("M") && idade[i] > 21) {

			}

		}
		System.out.println("Nome: " + nome[i]);
	}
}
