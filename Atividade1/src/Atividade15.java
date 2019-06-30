

import br.com.util.Teclado;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas,
		 * e exiba nome, valor da alíquota do imposto de renda, e o salário já com o
		 * desconto realizado, sabendo-se que: Salário Bruto Alíquota Salário menor que
		 * R$ 600,00 Isento Salário entre R$ 600,00 e R$ 1499,99 10 % do salário bruto
		 * Salário a partir de R$ 1500,00 15 % do salário bruto
		 * 
		 */

		String nome;
		double salarioBruto;
		double aliquota;
		double salarioLiquido;
		double desconto;

		for (int i = 0; i < 10; i++) {

			nome = Teclado.lerTexto("Informe o nome do funcionário: ");
			salarioBruto = Teclado.lerDouble("Informe o salário bruto");

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
			System.out.println("Salário bruto: " + salarioBruto);
			System.out.println("Valor de desconto: " + desconto);
			System.out.println("Valor salário líquido: " + salarioLiquido);
			System.out.println("----------------------");
		}

	}
}