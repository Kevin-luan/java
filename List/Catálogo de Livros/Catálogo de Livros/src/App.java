public class App {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.addLivro("fsdfa", "ndlan", 1222);
        catalogoLivros.addLivro("k", "Luan", 1222);
      

        System.out.println(catalogoLivros.obterNumeroDeLivros());

        System.out.println(catalogoLivros.pesquisarPorAutor("Luan"));
    }
}
