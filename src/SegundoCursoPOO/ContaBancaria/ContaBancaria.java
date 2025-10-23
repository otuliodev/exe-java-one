package SegundoCursoPOO.ContaBancaria;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de "+valor+" realizado.");
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de "+valor+" realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo atual: "+saldo);
    }
}
