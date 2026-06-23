
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome ");
            String nome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            float altura = 1.2f;
            System.out.println(nome);
            System.out.println(idade);
            System.out.println(altura);

            scanner.close();

        } catch (Exception e) {

            System.err.println("O nome precisa ser numericos");
        }

    }
}
