

import br.com.util.Teclado;

public class Atividade27 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte 5 números inteiros
            e identifique o maior número e o menor número
		 * 
		 */
		
		
		int num1 ;
		int num2;
		int num3;
		int num4;
		int num5;
		int maiorNumero = 0;
		int menorNumero = 0;
		
		num1 = Teclado.lerInt("Informe o 1ª número: ");
		num2 = Teclado.lerInt("Informe o 2ª número: ");
		num3 = Teclado.lerInt("Informe o 3ª número: ");
		num4 = Teclado.lerInt("Informe o 4ª número: ");
		num5 = Teclado.lerInt("Informe o 5ª número: ");
		
		
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			maiorNumero = num1;
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			maiorNumero = num2;
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 ) {
			maiorNumero = num3;
		}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 ) {
			maiorNumero = num4;
		}else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 ) {
			maiorNumero = num5;
		}
	
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			menorNumero = num1;
		} else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			menorNumero = num2;
		} else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			menorNumero = num3;
		}else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5 ) {
			maiorNumero = num4;
		}else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4 ) {
			maiorNumero = num5;
		}
		  System.out.println("O menor número inforomado foi: " + menorNumero);
		  System.out.println("O maior número informado foi: " + maiorNumero);
	}

}
	