

import br.com.util.Teclado;

public class Atividade21 {
	public static void main(String[] args) {
    /*Desenvolver um programa que pergunte dois valores numéricos inteiros e 
     * apresente o valor da diferença entre o maior valor e o menor valor lido.
     */
		int numero1;
		int numero2;
		int resultado; 
		
		
		numero1 = Teclado.lerInt("Informe o 1ª número: ");
		numero2 = Teclado.lerInt("Informe o 2ª número: ");
		
		
			if (numero1 == numero2) {
				System.out.println("Não a diferença entre eles:");
			}
			else if (numero1 > numero2) {
				resultado = numero1 - numero2;
				System.out.println("A diferença entre eles é de: " + resultado );
			}
			else if (numero1 < numero2) {
				resultado = numero2 - numero1;
				System.out.println("A diferença entre eles é de: " + resultado );
			}
			
			
		
		
			
		
		
	}

	}

