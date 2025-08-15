// Para herdar de uma classe abstrata em Java, você usa a palavra-chave extends,
                //public class Cachorro extends Animal
// da mesma forma que em uma herança comum. A diferença é que, se a classe abstrata
// tiver métodos abstratos, a classe filha é obrigada a implementá-los,
// a menos que ela também seja abstrata.


public class Gato extends Animal {
    @Override


    public void fazerSom(){

        System.out.println("Miau");
    }
public Gato (String nome){
super(nome);
    System.out.println(nome);
}

}
