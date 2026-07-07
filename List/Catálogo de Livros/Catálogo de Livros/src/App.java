public class App {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.addLivro("fsdfa", "ndlan", 1222);
        catalogoLivros.addLivro("k", "Luan", 122);

        System.out.println(catalogoLivros.obterNumeroDeLivros());
        System.out.println(catalogoLivros.pesquisarPorAutor("Luan"));
        System.out.println(catalogoLivros.persquisarLivroData(1222, 0));

    }
}
