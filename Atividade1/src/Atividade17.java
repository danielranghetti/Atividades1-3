

import br.com.util.Teclado;

public class Atividade17 {

	public static void main(String[] args) {
		/*Desenvolver um programa que permita ao aluno responder qual a capital do Brasil.
		 * O programa dever� exibir se a resposta est� certa ou errada.
		 */
		String resposta;
		
		resposta = Teclado.lerTexto("Qual � a capital do Brasil ? ");
		
		if (resposta.equalsIgnoreCase("Bras�lia")) {
			System.out.println("Sua resposta esta correta");
		}
		else {
			System.out.println("Sua resposta est� incorreta");
		}

	}

}
