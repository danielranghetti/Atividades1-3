

import br.com.util.Teclado;

public class Atividade20 {

	public static void main(String[] args) {
		/* Desenvolver um programa que pergunte 4 notas escolares de um aluno e
         exiba mensagem informando que o aluno foi aprovado se a m�dia escolar for maior ou igual a 5. 
         Se o aluno n�o foi aprovado, indicar uma mensagem informando essa condi��o. Apresentar junto com a 
         mensagem de aprova��o ou reprova��o o valor da m�dia obtida pelo aluno*/
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		
		
		nota1 = Teclado.lerDouble("Informe a 1� nota do aluno: ");
		nota2 = Teclado.lerDouble("Informe a 2� nota do aluno: ");
		nota3 = Teclado.lerDouble("Informe a 3� nota do aluno: ");
		nota4 = Teclado.lerDouble("Informe a 4� nota do aluno: ");
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		 if (media >= 5) {
			System.out.println("Aluno aprovado com m�dia: " + media);
		}else if(media < 5) {
			System.out.println("Aluno reprovado com m�dia: " + media);
		}
	}

}
