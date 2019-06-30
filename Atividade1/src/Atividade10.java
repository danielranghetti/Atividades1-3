

import br.com.util.Teclado;

public class Atividade10 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente o fatorial de um número informado pelo usuário
		int fat = 1;
		int numero; 
		numero = Teclado.lerInt("Digite o valor para calcular o fatorrial: ");
		for( int i = 1; i <= numero; i++ ){
		
		fat *= i;
		}

		System.out.println( "O fatorial de " + numero + " é igual a: " + fat );

	}

}
