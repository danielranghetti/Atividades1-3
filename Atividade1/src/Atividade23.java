

import br.com.util.Teclado;

public class Atividade23 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte
          um n�mero inteiro qualquer e verifique se ele est� na faixa de 1 a 10
		  */
		int numero;
		
		numero = Teclado.lerInt("Informe um n�mero inteiro: ");
		
		if (numero >= 1 && numero <= 10) {
			System.out.println("O seu n�mero est� na faixa de 1 a 10: ");
		}
		else {
			System.out.println("O seu n�mero n�o est� na faixa de 1 a 10: ");
		}
	}

}
