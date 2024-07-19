
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Banco banco = new Banco();

    public static void main(String[] args) {
        banco.setNome("Banco do Brasil");
        banco.setContas(new ArrayList<>());

        int op;
        do {
            op = menuPrincipal();
            switch (op) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarContas();
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 3);
    }

    private static int menuPrincipal() {
        while (true) {
            try {
                System.out.println("Escolha uma opção:");
                System.out.println("1. Cadastrar cliente e criar conta");
                System.out.println("2. Listar contas do banco");
                System.out.println("3. Sair");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }
    }

    private static void cadastrarCliente() {
        scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        Cliente cliente = new Cliente(nome);

        int tipoConta = escolherTipoConta();

        Conta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(cliente);
        } else {

            conta = new ContaPoupanca(cliente);
        }

        banco.getContas().add(conta);

        int opcaoConta;
        do {
            opcaoConta = menuConta();
            realizarOperacao(opcaoConta, conta);
        } while (opcaoConta != 0);
    }

    private static int escolherTipoConta() {
        while (true) {
            try {
                System.out.println("Escolha o tipo de conta: \n1. Conta Corrente \n2. Conta Poupança");
                int tipoConta = scanner.nextInt();
                if (tipoConta == 1 || tipoConta == 2) {
                    return tipoConta;
                } else {
                    System.out.println("Opção inválida. Escolha 1 para Conta Corrente ou 2 para Conta Poupança.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite 1 ou 2.");
                scanner.next();
            }
        }
    }

    private static int menuConta() {
        while (true) {
            try {
                System.out.println("Escolha a operação:");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Transferir");
                System.out.println("4. Imprimir Extrato");
                System.out.println("0. Sair");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }
    }

    private static void realizarOperacao(int operacao, Conta conta) {
        switch (operacao) {
            case 1:
                System.out.println("Digite o valor para depositar:");
                double valorDeposito = lerDouble();
                conta.depositar(valorDeposito);
                break;
            case 2:
                System.out.println("Digite o valor para sacar:");
                double valorSaque = lerDouble();
                conta.sacar(valorSaque);
                break;
            case 3:
                System.out.println("Digite o valor para transferir:");
                double valorTransferencia = lerDouble();
                System.out.println("Digite o número da conta de destino:");
                int numeroContaDestino = lerInteiro();
                Conta contaDestino = encontrarContaPorNumero(numeroContaDestino);
                if (contaDestino != null) {
                    conta.transferir(valorTransferencia, contaDestino);
                } else {
                    System.out.println("Conta de destino não encontrada.");
                }
                break;
            case 4:
                conta.imprimirInfosComuns();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static Conta encontrarContaPorNumero(int numero) {
        for (Conta conta : banco.getContas()) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    private static void listarContas() {
        System.out.println("=== Contas no Banco do Brasil ===");
        for (Conta conta : banco.getContas()) {
            conta.imprimirInfosComuns();
        }
    }

    private static int lerInteiro() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next();
            }
        }
    }

    private static double lerDouble() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                scanner.next();
            }
        }
    }
}
