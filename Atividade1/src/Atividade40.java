

import br.com.util.Teclado;

public class Atividade40 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que peça ao usuário para digitar diversos números
		 * reais, e ao final, exibir o maior e o menor número que foram digitados, além
		 * da média entre TODOS os números digitados pelo usuário. A inserção de números
		 * deve parar quando o usuário digitar o número -1, e este número -1 não deve
		 * ser considerado nem como maior, nem como menor, e nem na contagem da média.
		 * 
		 */
		double numero;
		double maior;
		double menor;
		double media;
		double soma = 0;
		double cont = 0;
		
		numero = Teclado.lerDouble("Informe um número(-1 encerra o programa)");
		
		menor = numero;
		maior = numero;
		for (int i = 0; numero!= -1; i++) {
			if (menor > numero) {
				menor = numero;
			}
			if (maior < numero) {
				maior = numero;
			}
			soma += numero;
			
			numero = Teclado.lerDouble("Informe um número(-1 encerra o programa)");
			cont++;
		}
		media = soma / cont;
		
		if (menor == -1) {
			System.out.println("Programa encerrado");
		}else {
		System.out.println("O menor valor foi: " + menor);
		System.out.println("O maior número informado foi: " + maior);
		System.out.println("A media dos valores é: " + media);
		}
		
		
		System.out.println("fim do programa");
	}

}
