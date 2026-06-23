public class MinhaClass {
    public static void main(String[] args) {
        String primeiroNome = "Kevin";
        String segundoNome = "Luan";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeroNome, String segundoNome) {

        return primeroNome.concat(segundoNome);
    }
}
