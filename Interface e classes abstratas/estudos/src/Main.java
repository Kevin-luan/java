
//Classes abstratas em Java são classes que não podem ser instanciadas
// diretamente — ou seja, você não pode criar objetos a partir delas.
// Elas são usadas como modelos ou superclasses genéricas para outras classes.
public class Main {
    public static void main(String[] args) {

   Gato g = new Gato("Tom");


        System.out.println(g.nome);
        g.fazerSom();
        }
    }
