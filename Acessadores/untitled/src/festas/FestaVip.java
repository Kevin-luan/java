package festas;

public class FestaVip {
 protected    int quantidadeCafe =30;
    int quantidadeSalgados =50 ;

    public void entrar(){11
        beberCafe();
        comerSalgado();

    }


   private void beberCafe(){
        quantidadeCafe = quantidadeCafe -1;
        System.out.println("Bebeu uima xicara de cafe");
    }

   private void comerSalgado(){
        quantidadeSalgados= quantidadeSalgados -1;
        System.out.println("Comeu 5 salgados");
    }


}
