

import br.com.util.Teclado;

public class Atividade17 {

	public static void main(String[] args) {
		/*Desenvolver um programa que permita ao aluno responder qual a capital do Brasil.
		 * O programa deverá exibir se a resposta está certa ou errada.
		 */
		String resposta;
		
		resposta = Teclado.lerTexto("Qual é a capital do Brasil ? ");
		
		if (resposta.equalsIgnoreCase("Brasília")) {
			System.out.println("Sua resposta esta correta");
		}
		else {
			System.out.println("Sua resposta está incorreta");
		}

	}

}
