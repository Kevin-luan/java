import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class ContaTerminal {
    public static void main(String[] args) {
  float saldo = 237;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o Numero da agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o Nome do cliente: ");
        String nomeCliente = scanner.next();

        scanner.close();
      
CriarConta(numeroConta, numeroAgencia, nomeCliente, saldo);


    }

    public static void CriarConta(int numeroConta, String agencia, String nomeCliente, float saldo) {
        System.out.println(
                "Ola " + nomeCliente + " obrigado por criar uma conta em nosso banco,\n " + "sua agencia e :" + agencia
                        + "\n Sua conta: " + numeroConta + "\nseu saldo e :" + saldo);

    }
}
