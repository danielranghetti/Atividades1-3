

import br.com.util.Teclado;

public class Atividade27 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte 5 n�meros inteiros
            e identifique o maior n�mero e o menor n�mero
		 * 
		 */
		
		
		int num1 ;
		int num2;
		int num3;
		int num4;
		int num5;
		int maiorNumero = 0;
		int menorNumero = 0;
		
		num1 = Teclado.lerInt("Informe o 1� n�mero: ");
		num2 = Teclado.lerInt("Informe o 2� n�mero: ");
		num3 = Teclado.lerInt("Informe o 3� n�mero: ");
		num4 = Teclado.lerInt("Informe o 4� n�mero: ");
		num5 = Teclado.lerInt("Informe o 5� n�mero: ");
		
		
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
		  System.out.println("O menor n�mero inforomado foi: " + menorNumero);
		  System.out.println("O maior n�mero informado foi: " + maiorNumero);
	}

}
	