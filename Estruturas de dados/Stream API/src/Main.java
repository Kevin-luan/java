import java.util.ArrayList;
import java.util.*;


//A Stream API em Java é um conjunto de recursos introduzido no Java 8
// que permite manipular coleções de dados de forma mais eficiente e declarativa,
// utilizando uma abordagem funcional. Ela simplifica operações como iteração,
// filtragem e transformação de elementos, tornando o código mais limpo e conciso.
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Kevin");
        list.add("Laun");
        list.add("Cardoso");
        list.add("Pascoal");
        list.add("Kevin 11");
        list.add("Kevin 22");




        // STREA API
         //Realizar operacoes finmcionais nas nessas colletions (Estruturas de dados)
        //filter, map, reduce ,agregacao
             // filter -> filtrar os elementos de uma colecao
            // map -> transformar os elementos de uma colecao
           // reduce -> reduz os elementos de uma colecao a um unico elemento
          // agregação -> some, medir, contagem, etc

       List<String> kevins = list.stream().filter(nome -> nome.startsWith("Kevin")).toList();
       System.out.println(kevins);

       // Usando o map
        List<String> kevinss = list
                .stream()
                .filter(nome -> nome.startsWith("Kevin"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(kevinss);









    }
}