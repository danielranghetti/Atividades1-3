

import br.com.util.Teclado;

public class Atividade20 {

	public static void main(String[] args) {
		/* Desenvolver um programa que pergunte 4 notas escolares de um aluno e
         exiba mensagem informando que o aluno foi aprovado se a média escolar for maior ou igual a 5. 
         Se o aluno não foi aprovado, indicar uma mensagem informando essa condição. Apresentar junto com a 
         mensagem de aprovação ou reprovação o valor da média obtida pelo aluno*/
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		
		
		nota1 = Teclado.lerDouble("Informe a 1ª nota do aluno: ");
		nota2 = Teclado.lerDouble("Informe a 2ª nota do aluno: ");
		nota3 = Teclado.lerDouble("Informe a 3ª nota do aluno: ");
		nota4 = Teclado.lerDouble("Informe a 4ª nota do aluno: ");
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		 if (media >= 5) {
			System.out.println("Aluno aprovado com média: " + media);
		}else if(media < 5) {
			System.out.println("Aluno reprovado com média: " + media);
		}
	}

}
