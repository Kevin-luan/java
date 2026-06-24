import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador;

        System.out.println("Digite o numero 1: ");
        int numero1 = scanner.nextInt();
        contador = numero1 + 1;

        System.out.println("Digite o numero 2: ");
        int numero2 = scanner.nextInt();

        try {
            ContardorDeIncremento(numero1, numero2, contador);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void ContardorDeIncremento(int numero1, int numero2, int contador) throws ParametrosInvalidosException {

        if (numero1 >= numero2) {
            throw new ParametrosInvalidosException(
                    "O segundo parâmetro deve ser maior que o primeiro");
        }

        while (contador <= numero2) {

            System.out.println(contador);
            contador++;

        }

    }
}
