package IContas;

public interface IContas {
    void sacar(double valor);
    void depositar (double valor);
    void transferir(double valor, IContas contaDestino);
    void imprimirExtrato();
}
