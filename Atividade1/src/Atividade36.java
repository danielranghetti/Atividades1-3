

public class Atividade36 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que apresente todos os valores num�ricos inteiros
		 * �mpares situados na faixa de 0 a 20. Para saber se o n�mero � �mpar, ser�
		 * necess�rio verificar essa condi��o com o comando if. Sendo �mpar, mostre-o;
		 * n�o sendo, passe para o pr�ximo passo.
		 */
		
		
		System.out.println("Os n�meros impares de 0 at� 20 s�o:");
		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
