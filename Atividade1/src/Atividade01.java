
public class Atividade01 {

	public static void main(String[] args) {
		// 1- Desenvolver um programa que apresente todos os valores
		// num�ricos inteiros �mpares situados na faixa de 1000 a 1500
		System.out.println("Valores �mpares:");
		for (int numeros = 1000; numeros <= 1500; numeros++) {
			if (numeros % 2 != 0) {

				System.out.println(numeros);
			}
		}
	}

}
