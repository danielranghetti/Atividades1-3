
public class Atividade12 {

	public static void main(String[] args) {
		/*
		 * Agora fa�a uma altera��o para que sejam apresentados somente os itens acima
		 * da diagonal principal da matriz anterior. No lugar que n�o � para exibir a
		 * triangula��o, dever� aparecer x-x
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
