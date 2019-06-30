

import br.com.util.Teclado;

public class Atividade22 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e
               exiba como resposta o módulo deste valor, ou seja, o número lido como sendo positivo. 
		 */
		int valor;
		int modulo;
		
		valor = Teclado.lerInt("informe um valor inteiro possitivo ou negativo: ");
		
		if (valor < 0) {
			modulo = valor * -1;
		System.out.println("O módulo do valor informado é: " + modulo );	
		}
		else if (valor > 0) {
			System.out.println("O módulo do valor informado é: " + valor);
		}
		
	}

}
