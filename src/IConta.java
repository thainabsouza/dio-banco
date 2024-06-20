
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}

/*public class Conta implements IConta {
    private int agencia;
    private int numero;
    private  double saldo;

    public int getAgencia() {
        return agencia;
    };
    public int getNumero() {
        return agencia;
    };
    public int getSaldo() {
        return agencia;
    };


}*/
