

import br.com.util.Teclado;

public class Atividade19 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um valor numérico inteiro e faça a
          exibição desse valor caso seja divisível por 4 e 5. Não sendo divisível por 4 e 5, o programa
                deverá exibir a mensagem “Valor não é divisível por 4 e 5”*/
			int numero;
			
			numero = Teclado.lerInt("Digite um número inteiro: ");
			
			if (numero % 4 ==0 && numero % 5 ==0) {
				System.out.println("O número informado foi: " + numero);
			}else {
				System.out.println("Valor não é divisível por 4 e 5");
			}

	}

}
