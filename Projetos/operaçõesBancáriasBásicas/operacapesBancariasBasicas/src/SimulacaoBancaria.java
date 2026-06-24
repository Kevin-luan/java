import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 100;

        Tela();
        int opcao = scanner.nextInt();

        while (opcao != 0) {
            saldo = Conta(opcao, saldo);

            Tela();
            opcao = scanner.nextInt();
        }

        System.out.println("Saindo da conta...");
        scanner.close();
    }

    static int Conta(int opcao, int saldo) {
        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para depósito: ");
                int depositar = scanner.nextInt();
                saldo += depositar;
                System.out.println("Seu saldo atual é: " + saldo);
                break;

            case 2:
                System.out.print("Digite o valor para saque: ");
                int saque = scanner.nextInt();

                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Seu saldo atual é: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
                break;

            case 3:
                System.out.println("Seu saldo atual é: " + saldo);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        return saldo;
    }

    static void Tela() {
        System.out.println("\n========== Bem-vindo ao Banco ==========");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar dinheiro");
        System.out.println("3 - Exibir saldo");
        System.out.println("0 - Sair da conta");
        System.out.print("Digite a opção desejada: ");
    }
}