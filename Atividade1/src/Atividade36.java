

public class Atividade36 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente todos os valores numéricos inteiros
		 * ímpares situados na faixa de 0 a 20. Para saber se o número é ímpar, será
		 * necessário verificar essa condição com o comando if. Sendo ímpar, mostre-o;
		 * não sendo, passe para o próximo passo.
		 */
		
		
		System.out.println("Os números impares de 0 até 20 são:");
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
