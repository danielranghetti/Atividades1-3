

import br.com.util.Teclado;

public class Atividade18 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um n�mero, 
		 * e apresente como resposta se o referi do n�mero � par ou � �mpar*/
		
		int numero;
		
		numero = Teclado.lerInt("Digite o n�mero para saber se ele � par ou impar: ");
		
		if (numero % 2 == 0) {
			System.out.println("O n�mero informado � par");
		}else if (numero != 0) {
			System.out.println("o n�mero informado � impar");
		}

	}

}
