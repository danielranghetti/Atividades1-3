

import br.com.util.Teclado;

public class Atividade09 {

	public static void main(String[] args) {
		// Desenvolver  um  programa  que  pergunte  um  número  inteiro  e  exiba  os números  que  são,  
		//ao  mesmo  tempo, múltiplos de 3 e 5, na sequência de 1 até o número informado pelo usuário
		int numero;
		
		numero = Teclado.lerInt("Digite o número: ");
		System.out.println("Os múltiplos de 3 e 5 são: ");
		for (int i = 1; i < numero; i++) {
			if (i % 3 == 0 && i % 5 ==0 ) {
				System.out.println( i);
			}
		}
		
	}

}
