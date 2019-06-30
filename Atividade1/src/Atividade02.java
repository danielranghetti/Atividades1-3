import br.com.util.Teclado;

public class Atividade02 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente o total da soma de n
		// números inteiros do número 1 até n, onde n é um valor informado pelo usuário.

		int soma = 0;
		int n;

		n = Teclado.lerInt("Digite um número: ");
		for (int numero = 1; numero <= n; numero++) {
			soma = numero + soma;
			
		}
		System.out.println("valor da soma de 1 até " + n + " é: " + soma);

	}
}
