

import br.com.util.Teclado;

public class Atividade09 {

	public static void main(String[] args) {
		// Desenvolver  um  programa  que  pergunte  um  n�mero  inteiro  e  exiba  os n�meros  que  s�o,  
		//ao  mesmo  tempo, m�ltiplos de 3 e 5, na sequ�ncia de 1 at� o n�mero informado pelo usu�rio
		int numero;
		
		numero = Teclado.lerInt("Digite o n�mero: ");
		System.out.println("Os m�ltiplos de 3 e 5 s�o: ");
		for (int i = 1; i < numero; i++) {
			if (i % 3 == 0 && i % 5 ==0 ) {
				System.out.println( i);
			}
		}
		
	}

}
