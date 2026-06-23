public class BoletinEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 3;

        if (mediaFinal < 6) {
            System.out.print("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.print("Aprovado na media");
        }else{
            System.out.print("Parabens!! \n Voce Foi aprovado");
        }

    }

}