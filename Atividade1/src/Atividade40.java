

import br.com.util.Teclado;

public class Atividade40 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pe�a ao usu�rio para digitar diversos n�meros
		 * reais, e ao final, exibir o maior e o menor n�mero que foram digitados, al�m
		 * da m�dia entre TODOS os n�meros digitados pelo usu�rio. A inser��o de n�meros
		 * deve parar quando o usu�rio digitar o n�mero -1, e este n�mero -1 n�o deve
		 * ser considerado nem como maior, nem como menor, e nem na contagem da m�dia.
		 * 
		 */
		double numero;
		double maior;
		double menor;
		double media;
		double soma = 0;
		double cont = 0;
		
		numero = Teclado.lerDouble("Informe um n�mero(-1 encerra o programa)");
		
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
			
			numero = Teclado.lerDouble("Informe um n�mero(-1 encerra o programa)");
			cont++;
		}
		media = soma / cont;
		
		if (menor == -1) {
			System.out.println("Programa encerrado");
		}else {
		System.out.println("O menor valor foi: " + menor);
		System.out.println("O maior n�mero informado foi: " + maior);
		System.out.println("A media dos valores �: " + media);
		}
		
		
		System.out.println("fim do programa");
	}

}
