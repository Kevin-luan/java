public class Pessoas implements Comparable<Pessoas> {

    private String nome;
    private int idade;
    private int altura;

    public Pessoas(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }
       @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }


    @Override
    public int compareTo(Pessoas p) {
        return Integer.compare(idade, p.getIdade());
    }

 
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAltura() {
        return altura;
    }

}
