

import br.com.util.Teclado;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte o nome e o sal�rio bruto de 10 pessoas,
		 * e exiba nome, valor da al�quota do imposto de renda, e o sal�rio j� com o
		 * desconto realizado, sabendo-se que: Sal�rio Bruto Al�quota Sal�rio menor que
		 * R$ 600,00 Isento Sal�rio entre R$ 600,00 e R$ 1499,99 10 % do sal�rio bruto
		 * Sal�rio a partir de R$ 1500,00 15 % do sal�rio bruto
		 * 
		 */

		String nome;
		double salarioBruto;
		double aliquota;
		double salarioLiquido;
		double desconto;

		for (int i = 0; i < 10; i++) {

			nome = Teclado.lerTexto("Informe o nome do funcion�rio: ");
			salarioBruto = Teclado.lerDouble("Informe o sal�rio bruto");

			if (salarioBruto < 600) {
				aliquota = 0;

			} else if (salarioBruto < 1500) {
				aliquota = 0.10;
			} else {
				aliquota = 0.15;
			}
			desconto = salarioBruto * aliquota;
			salarioLiquido = salarioBruto - desconto;

			System.out.println("--------------------");
			System.out.println("Nome: " + nome);
			System.out.println("Sal�rio bruto: " + salarioBruto);
			System.out.println("Valor de desconto: " + desconto);
			System.out.println("Valor sal�rio l�quido: " + salarioLiquido);
			System.out.println("----------------------");
		}

	}
}