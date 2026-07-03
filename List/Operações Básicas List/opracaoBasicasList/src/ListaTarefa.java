import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricaoTarefa) {
        tarefaList.add(new Tarefa(descricaoTarefa));
    }

    public void removerTarefa(String descricaoTarefa) {

        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {

            if (t.getDescricaoTarefa().equalsIgnoreCase(descricaoTarefa))

                tarefaParaRemover.add(t);
        }
        tarefaParaRemover.removeAll(tarefaParaRemover);
    }

    public int numeroTotalDeTarefa() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        for (Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricaoTarefa());
        }

    }

    public static void main(String[] args) {

        ListaTarefa listTarefa = new ListaTarefa();
        System.out.println("O numero total de tarefa na lista e: " + listTarefa.numeroTotalDeTarefa());
        String descricao1 = "Descricao da tarefa 1";

        String descricao2 = "Descricao da tarefa 2";

        String descricao3 = "Descricao da tarefa 3";

        listTarefa.addTarefa(descricao1);
        listTarefa.addTarefa(descricao2);
        System.out.println(descricao3);

        listTarefa.removerTarefa(descricao3);
        listTarefa.obterDescricaoTarefa();

        System.out.println("O numero total de tarefa na lista e: " + listTarefa.numeroTotalDeTarefa());
        System.out.println("+++++++++++++++++++++++");

        listTarefa.obterDescricaoTarefa();
    }
}
