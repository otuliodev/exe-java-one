package SegundoCursoPOO.ContaBancaria;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTarifaMensal(double valor){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de "+ tarifaMensal+" cobrada.");
    }
}
