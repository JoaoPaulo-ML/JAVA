import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o nome do aluno");
		String nome = leitor.next();
		System.out.println("Digite a 1ª nota");
		double a = leitor.nextDouble();
		System.out.println("Digite a 2ª nota");
		double b = leitor.nextDouble();
		System.out.println("Digite a 3ª nota");
		double c = leitor.nextDouble();
		System.out.println("Digite a 4ª nota");
		double d = leitor.nextDouble();

		Media al = new Media(a, b, c, d, nome);

		double media = al.calculo();

		System.out.println("Nota final: " + media);

		if (media >= 6.0) {
			System.out.println(nome + " Aprovado!");
		} else {
			System.out.println(nome + " Reprovado.");
		}

	}

}
