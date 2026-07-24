import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();

     curso1.setTitulo("Java");
     curso1.setDescricao("Conseitos da POO");
     curso1.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Ajudar com a POO");



     System.out.println(curso1);

        System.out.println(mentoria1);



    }
}
