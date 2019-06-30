

import br.com.util.Teclado;

public class Atividade26 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um número de 3 casas
           e apresente como resultado somente o algarismo das centenas.
		 * 
		 */
		int casa1;
		int casa2;
		int casa3;
		int centena;
		casa1  = Teclado.lerInt("informe o número da 1ª casa: ");
		casa2 = Teclado.lerInt("informe o número da 2ª casa: ");
		casa3 = Teclado.lerInt("informe o número da 3ª casa: ");
		
		for (int i = 0; i < 1; i++) {
			centena = casa1 / 100;
			System.out.println("A centena da 1ª casa = " + centena);
		}
		for (int i = 0; i < 1; i++) {
			centena = casa2 / 100;
			System.out.println("A centena da 2ª casa = " + centena);
		}
		for (int i = 0; i < 1; i++) {
			centena = casa3 / 100;
			System.out.println("A centena da 3ª casa = " + centena);
		}
	}

}
