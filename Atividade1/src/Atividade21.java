

import br.com.util.Teclado;

public class Atividade21 {
	public static void main(String[] args) {
    /*Desenvolver um programa que pergunte dois valores num�ricos inteiros e 
     * apresente o valor da diferen�a entre o maior valor e o menor valor lido.
     */
		int numero1;
		int numero2;
		int resultado; 
		
		
		numero1 = Teclado.lerInt("Informe o 1� n�mero: ");
		numero2 = Teclado.lerInt("Informe o 2� n�mero: ");
		
		
			if (numero1 == numero2) {
				System.out.println("N�o a diferen�a entre eles:");
			}
			else if (numero1 > numero2) {
				resultado = numero1 - numero2;
				System.out.println("A diferen�a entre eles � de: " + resultado );
			}
			else if (numero1 < numero2) {
				resultado = numero2 - numero1;
				System.out.println("A diferen�a entre eles � de: " + resultado );
			}
			
			
		
		
			
		
		
	}

	}

