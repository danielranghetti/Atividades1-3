
public class Atividade11 {

	public static void main(String[] args) {
		// Desenvolver um programa que triangule uma matriz de ordem 10.Deverá aparecer
		// como resposta algo assim na tela

		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= 10; b++) {
				if (a >= 1 && a <= 9) {
					System.out.print(a + "-" + b + "     ");
				} else {
					System.out.print(a + "-" + b + "    ");
				}
			}
			System.out.println();
		}

	}

}
