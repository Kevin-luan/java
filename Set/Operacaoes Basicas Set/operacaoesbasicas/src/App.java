public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conmConvidados = new ConjuntoConvidados();

        
        conmConvidados.adicionarConvidado("Kevin", 123);
        conmConvidados.adicionarConvidado("Luan", 999);
        conmConvidados.adicionarConvidado("convincvoa", 222);

        conmConvidados.exibirConvidados();


        System.out.println("Quantidados de convidados " + conmConvidados.contarConvidado());

        conmConvidados.removerConvidadoPorCodigoDoConvite(123);

        System.out.println("Quantidados de convidados " + conmConvidados.contarConvidado());
    }
}
