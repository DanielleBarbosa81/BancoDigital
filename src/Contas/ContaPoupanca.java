package Contas;

import Clientes.Cliente;

public abstract class ContaPoupanca  extends  Conta{

    public  ContaPoupanca(Cliente cliente){
        super();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Poupança *** ");
        super.imprimirInfosComuns();
    }
}
