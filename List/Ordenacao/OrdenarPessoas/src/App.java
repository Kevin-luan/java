public class App {
    public static void main(String[] args) throws Exception {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoas("Kevin", 22, 160);
        ordenacaoPessoas.adicionarPessoas("luan", 21, 160);
        ordenacaoPessoas.adicionarPessoas("cardoso", 42, 160);



        System.out.println(ordenacaoPessoas.ordenadoPorIdade());

    }
}
