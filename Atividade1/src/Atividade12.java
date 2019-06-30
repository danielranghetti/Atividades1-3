
public class Atividade12 {

	public static void main(String[] args) {
		/*
		 * Agora faça uma alteração para que sejam apresentados somente os itens acima
		 * da diagonal principal da matriz anterior. No lugar que não é para exibir a
		 * triangulação, deverá aparecer x-x
		 * 
		 */

		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= 10; b++) {
				if (a >= b) {
					System.out.print("x-x ");
				} else {
					System.out.print(a + "-" + b + " ");
				}

			}
			System.out.println();
		}

	}

}
