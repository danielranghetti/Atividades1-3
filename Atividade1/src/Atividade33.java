

import br.com.util.Teclado;

public class Atividade33 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente os resultados de uma tabela de um
		 * número qualquer. Ela deve ser impressa no seguinte formato:
		 */
		int num;
		int res;
		num = Teclado.lerInt("Informe um número:");
			
		for (int i = 1; i <=10; i++) {
			res = num * i;
			System.out.println(num + " . " + i + " = " + res );
			
		}
	}

}
