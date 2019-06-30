
public class Atividade07 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente no final a
		// soma dos valores pares existentes na faixa de 3 até 21
		int soma = 0;

		for (int numero = 3; numero < 21; numero++) {
			if (numero % 2 == 0) {
				soma = numero + soma;
				numero++;
			}

		}
		System.out.println("Valor das somas: " + soma);
	}

}
