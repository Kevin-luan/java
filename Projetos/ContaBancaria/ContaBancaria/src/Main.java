

public class Main {
    public static void main(String[] args) {
     Conta cc = new ContaCorrente();
     Conta cp= new ContaPoupanca();

     cc.depositar(100);
     System.out.println(cc.saldo);
     cc.sacar(12);
     System.out.println(cc.saldo);

        System.out.println("===================================");

        cp.depositar(220);
        System.out.println(cp.saldo);
        cp.sacar(111);
        System.out.println(cp.saldo);

    }


}