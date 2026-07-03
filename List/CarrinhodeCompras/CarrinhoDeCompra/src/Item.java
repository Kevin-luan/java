public class Item {
    String nomeItem;
    int preco;
    int quantidade;

    public Item(String nomeItem, int preco, int quantidade) {
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getPreco() {
        return preco;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
