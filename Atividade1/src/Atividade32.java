

public class Atividade32 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
		 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
		 * 
		 */
		int soma = 0;
		for (int i = 0; i <=100; i++) {
			soma += i;
		}
		System.out.println("A soma dos Números inteiros de 1 até 100 é: " + soma);
	}

}
