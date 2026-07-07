import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autorLivro, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autorLivro, anoPublicacao));

    }

    public int obterNumeroDeLivros() {

        return livrosList.size();
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {

            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }

        }
        return livroPorAutor;
    }

    public List<Livro> persquisarLivroData(int anoIncial, int anoFinal) {
        List<Livro> livroPorData = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoIncial && l.getAnoPublicacao() <= anoIncial) {
                    livroPorData.add(l);
                }
            }

        }
        return livroPorData;
    }

}