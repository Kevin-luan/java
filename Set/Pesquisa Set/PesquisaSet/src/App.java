public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Kevin", 1123120);
        agendaContatos.adicionarContato("bdiubada", 10);
        agendaContatos.adicionarContato("Kedadadasvin", 1123120);
        agendaContatos.adicionarContato("Kdadadvin", 21121);

        agendaContatos.exibirContato();

        System.out.println("+++++ Pesquisar contato por nome :  +++++=\n");

        System.out.println(agendaContatos.pesquisarPorNome("Kevin"));

        System.out.println("+++++ Atualiza o numero de contato por nome :  +++++=\n");

        agendaContatos.atualizarContato("Kevin", 111);
        System.out.println(agendaContatos.pesquisarPorNome("Kevin"));

    }
}
