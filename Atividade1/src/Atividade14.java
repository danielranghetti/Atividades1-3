import br.com.util.Teclado;

public class Atividade14 {

	

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte nome, nota1e nota2de cada um dos 15
		 * alunos de uma turma. E exiba a listagem contendo nome, nota1, nota2, m�diae
		 * apresente �APROVADO� se a m�dia for maior ou igual a 5, e �REPROVADO� se a
		 * m�dia for menor que 5. Ao final, exibir tamb�m a m�dia da turma
		 * 
		 */
			String  nome;
			double  nota1;
			double  nota2;
			double media;
			double soma =0;
			double mediaTurma;
			String situacao;
			
			for (int i = 0; i < 15; i++) {
			nome = Teclado.lerTexto("Digite o nome do aluno: ");
			nota1  = Teclado.lerDouble("Digite a 1� nota do aluno: ");
			nota2  = Teclado.lerDouble("Digite a 2� nota do aluno: ");
			
			media = (nota1 + nota2) / 2;

			soma += media;
			
				if (media >= 5) {
					situacao = "Aprovado";
				}
				else {
					situacao = "Reprovado";
				}
				System.out.println("--------------");
				System.out.println("Nome: " + nome);
				System.out.println("Nota 1: " + nota1);
				System.out.println("Nota 2: " + nota2);
				System.out.println("media: " + media);
				System.out.println("Aprovado ou reprovado: " + situacao);
				System.out.println("--------------");
				
			}
			mediaTurma = soma / 15;
			System.out.println("A m�dia da turma foi:" + mediaTurma);
	}

}
