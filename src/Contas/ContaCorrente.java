package Contas;

import Clientes.Cliente;

public class ContaCorrente  extends  Conta{

    public ContaCorrente(Cliente cliente){
        super();

    }

    public ContaCorrente() {
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Corrente *** ");
        super.imprimirInfosComuns();
    }
}
