public class Conta {

    private static final int  AGENCIA_PADRAO = 1;

    private  static int SEQUENCIAL = 1;

    protected   int agencia;
    protected   int numeroConta;
    protected   double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL ++;
    }




    public void sacar(double valor){
        saldo = saldo-valor;
    }
    public void depositar(double valor){
    saldo = saldo+ valor;
    }
    public void transferir(double valo, Conta contaDestino){
        this.sacar(valo);
        contaDestino.depositar(valo);

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }
}
