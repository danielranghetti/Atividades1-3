

import br.com.util.Teclado;

public class Atividade23 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte
          um número inteiro qualquer e verifique se ele está na faixa de 1 a 10
		  */
		int numero;
		
		numero = Teclado.lerInt("Informe um número inteiro: ");
		
		if (numero >= 1 && numero <= 10) {
			System.out.println("O seu número está na faixa de 1 a 10: ");
		}
		else {
			System.out.println("O seu número não está na faixa de 1 a 10: ");
		}
	}

}
