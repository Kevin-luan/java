import java.util.Comparator;
import java.util.Objects;



public class Produto implements Comparable<Produto> {
    private String nome;
    private long codigo;
    private Double preco;
    private int quantidade;

    public Produto(String nome, long codigo, Double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Produto produto))
            return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    class ComparatorPorPreco implements Comparator<Produto>{
        @Override 
        public int compare(Produto p1, Produto p2){
            return Double.compare(p1.getPreco(), p2.getPreco());
        }

    }

}
