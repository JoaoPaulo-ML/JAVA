
public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;

    public int getNumero() {
        return numero;
    }

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(double valor, Conta contaDestino);

    protected abstract void imprimirInfosComuns();
}
