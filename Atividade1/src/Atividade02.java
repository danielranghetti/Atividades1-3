import br.com.util.Teclado;

public class Atividade02 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente o total da soma de n
		// n�meros inteiros do n�mero 1 at� n, onde n � um valor informado pelo usu�rio.

		int soma = 0;
		int n;

		n = Teclado.lerInt("Digite um n�mero: ");
		for (int numero = 1; numero <= n; numero++) {
			soma = numero + soma;
			
		}
		System.out.println("valor da soma de 1 at� " + n + " �: " + soma);

	}
}
