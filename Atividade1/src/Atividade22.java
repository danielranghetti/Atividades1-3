

import br.com.util.Teclado;

public class Atividade22 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e
               exiba como resposta o m�dulo deste valor, ou seja, o n�mero lido como sendo positivo. 
		 */
		int valor;
		int modulo;
		
		valor = Teclado.lerInt("informe um valor inteiro possitivo ou negativo: ");
		
		if (valor < 0) {
			modulo = valor * -1;
		System.out.println("O m�dulo do valor informado �: " + modulo );	
		}
		else if (valor > 0) {
			System.out.println("O m�dulo do valor informado �: " + valor);
		}
		
	}

}
