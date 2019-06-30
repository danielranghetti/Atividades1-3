

public class Atividade42 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
		 * Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
		 * equivalente a 120
		 * 
		 */
		int fat = 1;
		int numero = 5; 
		
		for( int i = 1; i <= numero; i++ ){
		
		fat *= i;
		}

		System.out.println( "O fatorial de 5 é igual a: " + fat );

	}

}
