

import br.com.util.Teclado;

public class Atividade19 {

	public static void main(String[] args) {
		/*Desenvolver um programa que pergunte um valor num�rico inteiro e fa�a a
          exibi��o desse valor caso seja divis�vel por 4 e 5. N�o sendo divis�vel por 4 e 5, o programa
                dever� exibir a mensagem �Valor n�o � divis�vel por 4 e 5�*/
			int numero;
			
			numero = Teclado.lerInt("Digite um n�mero inteiro: ");
			
			if (numero % 4 ==0 && numero % 5 ==0) {
				System.out.println("O n�mero informado foi: " + numero);
			}else {
				System.out.println("Valor n�o � divis�vel por 4 e 5");
			}

	}

}
