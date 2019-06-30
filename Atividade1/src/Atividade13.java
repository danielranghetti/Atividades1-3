


import br.com.util.Teclado;

public class Atividade13 {

	public static void main(String[] args) {
		/* Sabendo-se que uma Polegada equivale a 2,54 centímetros, 
		 * desenvolver um programa que exiba uma tabela de conversões  de  polegadas  para  centímetros, 
		 * de  1  polegada  até  um  valor  inteiro  de  polegada  inserido  pelo usuário
		 */
		
		double cm = 2.54;
		int pol;
		double conversao;
		pol = Teclado.lerInt("informe a plegada para a coversão:");
		
		for(int i =1; i <=pol; i++) {
			conversao = i * cm;
			
		System.out.println(i +" polegadas equivale á = " + conversao + "  centrímetos");
		}
		
	}

}
