

public class Atividade35 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente todos os n�meros divis�veis por 4 que
		 * sejam menores que 200. Para saber se o n�mero � divis�vel por 4 ser�
		 * necess�rio verificar a l�gica desta condi��o com o comando if. Sendo
		 * divis�vel, mostre-o; n�o sendo, passe para o pr�ximo passo. A vari�vel que
		 * controla o contador deve ser iniciada com valor 1
		 */
		for (int i = 1; i < 200; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
			
		}
	}

}
