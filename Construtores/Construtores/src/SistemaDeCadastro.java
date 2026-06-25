public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoas kevin = new Pessoas("kevin","223132131");

        kevin.setEndereco("Rua general jardim");
       

        System.out.println(kevin.getNome());
        System.out.println(kevin.getCpf());
        System.out.println(kevin.getEndereco());

    }
}
