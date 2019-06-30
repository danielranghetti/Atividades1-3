import br.com.util.Teclado;

public class Atividade03 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente os resultados de
		// uma tabuada de um número qualquer informado pelo usuário

		int tabuada; 
		int res;
		tabuada = Teclado.lerInt("Digite o número para a tabuada: ");

		for (int i = 0; i <= 10; i++) {
			res =  i * tabuada;
			System.out.println(i + " x " + tabuada + " = " + res);
			

		}

	}
}