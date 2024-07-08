
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int opcao;
		double saldo = 0;

		do {

			System.out.println("Digite a sua opcao:\n\n *0-Encerrar\n *1-Depositar\n *2-Sacar\n *3-Exibir\n");
			opcao = scanner.nextInt();

			switch (opcao) {

			case 0:
				System.out.println("Programa encerrado.");
				break;
			case 1:
				// TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
				saldo = depositar(saldo);
				break;
			case 2:
				// TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
				saldo = sacar(saldo);
				break;
			case 3:
				// TODO: Exibir o saldo atual da conta.
				exibir(saldo);
				break;
			default:
				System.out.println("Opcao invalida. Tente novamente.");
			}
		} while (opcao != 0);
	}

	public static double depositar(double saldo) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Digite o valor que voce queira depositar:");
			double depositar = scanner.nextDouble();

			if (depositar > 0) {
				saldo += depositar;

				System.out.println("\nSaldo atual: " + saldo + "\n");
			} else {
				System.out.println("Erro!!!\nO deposito so aceita numeros positivos");
			}

		} catch (InputMismatchException e) {
			System.out.println("\n-------Erro usario digitou caracter-------\n\t\tTente novamente\n");
		}
		return saldo;

	}

	public static double sacar(double saldo) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Digite o valor que voce queira sacar:");
			double sacado = scanner.nextDouble();

			if (sacado > 0) {

				if (sacado <= saldo) {
					saldo -= sacado;

					System.out.println("\nSaldo atual: " + saldo + "\n");
				} else {
					System.out.println("Saldo insuficiente\n");
				}
			} else {
				System.out
						.println("\nO valor sacado nao deve estar conter sinal NEGATIVO tente novamente sem o sinal\n");
			}
		} catch (InputMismatchException e) {
			System.out.println("\n-------Erro usario digitou caracter-------\n\t\tTente novamente\n");
		}

		return saldo;
	}

	public static void exibir(double saldo) {
		System.out.println("Digite o saldo da sua conta: " + saldo);
	}

}
