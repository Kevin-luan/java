import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class OrdenacaoPessoas {

    private List<Pessoas> listPessoas;

    public OrdenacaoPessoas() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, int altura) {
        listPessoas.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenadoPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
}
