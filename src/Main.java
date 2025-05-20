import Clientes.Cliente;
import Contas.ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double  saldo = 100;

        System.out.println("Digite o nome do Cliente : ");
        String cliente = scan.nextLine();


        System.out.println("Valor Depósito : ");

        Double deposito = scan.nextDouble();

        saldo+= deposito;
        System.out.println(" Saldo atualizado " + saldo);


        System.out.println("Valor Saque : ");
        Double saque = scan.nextDouble();

        if( saque > saldo){
            System.out.println("Saldo insuficiente");
        }
 else {
            saldo -= saque;
            System.out.println(" Saque realizado com sucesso, seu novo saldo é :  " + saldo);
        }





    }
}