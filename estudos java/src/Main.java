
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     // Como converter um tipo de dado de uma variavel
     // Usando o tipo explicito
     double valor =0.0;
     // Convertendo para int
        int valorInt = (int) valor;
        valorInt= valorInt+10;
        System.out.println(valorInt);


        Pessoas p = new Pessoas("Kevin");
        p.andar();



      }
}

// Criando classe e metodos contrutores

 class Pessoas {
    String nome;
    public Pessoas(String nome){
        this.nome = nome;
        System.out.println(nome);

    }

    public void andar(){
        System.out.println(this.nome+" estar anadando");
    }
}



