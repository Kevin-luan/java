import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> carrinhoItems;

    public CarrinhoDeCompras() {

        this.carrinhoItems = new ArrayList<>();

    }

    public void addCarrinho(String nomeItem, int precoImotem, int quantidade) {
        carrinhoItems.add(new Item(nomeItem, precoImotem, quantidade));
    }

    public void removerItemDoCarrinho(String nomeItem) {
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item t : carrinhoItems) {
            if (t.getNomeItem().equalsIgnoreCase(nomeItem)) {
                itemParaRemover.add(t);
            }
        }

        carrinhoItems.removeAll(itemParaRemover);
    }

    public int numeroDeItems() {
        return carrinhoItems.size();
    }

    public void verProdutoCarrinho() {

        for (Item item : carrinhoItems) {
            System.out.println("Nome: " + item.getNomeItem());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Preço: R$ " + item.getPreco());
        }
    }

    public static void main(String[] args) {

        String nomeItem = "Sapato";
        int preco = 100;
        int quantidade = 3;
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.addCarrinho(nomeItem, preco, quantidade);

        System.out.println("quantidade de items: " + carrinhoDeCompras.numeroDeItems());
        carrinhoDeCompras.verProdutoCarrinho();
        carrinhoDeCompras.removerItemDoCarrinho(nomeItem);
        System.out.println("quantidade de items depois de delet: " + carrinhoDeCompras.numeroDeItems());

    }
}
