

public class Atividade31 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15
		 * a 200
		 */
		double quadrado;
		for (int num = 15; num <= 200; num++) {
			quadrado = Math.pow(num, 2);

			System.out.println(num + " elevado ao quadrado é = " + quadrado);
		}
	}

}
