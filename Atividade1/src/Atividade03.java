import br.com.util.Teclado;

public class Atividade03 {

	public static void main(String[] args) {
		// Desenvolver um programa que apresente os resultados de
		// uma tabuada de um n�mero qualquer informado pelo usu�rio

		int tabuada; 
		int res;
		tabuada = Teclado.lerInt("Digite o n�mero para a tabuada: ");

		for (int i = 0; i <= 10; i++) {
			res =  i * tabuada;
			System.out.println(i + " x " + tabuada + " = " + res);
			

		}

	}
}