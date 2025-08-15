
// Map -> Estrutura de Chave e valor -- { name: Kevin }
// Set -> Estrutura que não permite duplicatas -- MyList = [ kevin,luan,Jamili]
// list -> Estrutura que permite ter nomes duplicados -- MiList [Kevin,Kevin,kevin]
// Queue -> São as filas para processamento em ordem
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("++ Lista isando o list ++");
// list -> Estrutura que permite ter nomes duplicados -- MiList [Kevin,Kevin,kevin]
      List<String>list = new ArrayList<>();
      list.add("Kevin");
      list.add("kevin");
      list.add("Cardoso");
        System.out.println(list);

        System.out.println("++ Lista isando o Set ++");
// Set -> Estrutura que não permite duplicatas -- MyList = [ kevin,luan,Jamili]

      Set<String> listSet = new HashSet<>();
      listSet.add("Kevin");
      listSet.add("Kevin");//Passou por toda a lista e não add o nome "kevin", pois ja estava add na list
              System.out.println(listSet);

        System.out.println("++ Lista isando o Map ++");
        // Map -> Estrutura de Chave e valor -- { name: Kevin }

        Map<String, String> listMap = new HashMap<>();
        listMap.put ("nome", "kevin");
        listMap.put("sobreNome","Luan");

        listMap.get("nome");
        System.out.println(listMap.get("nome"));


        // Queue -> São as filas para processamento em ordem
        System.out.println("++ Lista isando o Queue ++");
        Queue<String> listQueue = new LinkedList<>();
        // new LinkedList<>():Cria uma nova LinkedList, que é uma estrutura de dados em lista
        // encadeada. Como LinkedList implementa a interface Queue, ela pode ser usada como uma fila.
listQueue.add("Kevin");
listQueue.add("Luan");

        System.out.println(listQueue.poll());
        System.out.println(listQueue);




    }
}