


import br.com.util.Teclado;

public class Atividade13 {

	public static void main(String[] args) {
		/* Sabendo-se que uma Polegada equivale a 2,54 cent�metros, 
		 * desenvolver um programa que exiba uma tabela de convers�es  de  polegadas  para  cent�metros, 
		 * de  1  polegada  at�  um  valor  inteiro  de  polegada  inserido  pelo usu�rio
		 */
		
		double cm = 2.54;
		int pol;
		double conversao;
		pol = Teclado.lerInt("informe a plegada para a covers�o:");
		
		for(int i =1; i <=pol; i++) {
			conversao = i * cm;
			
		System.out.println(i +" polegadas equivale � = " + conversao + "  centr�metos");
		}
		
	}

}
