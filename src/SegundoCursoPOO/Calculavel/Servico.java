package SegundoCursoPOO.Calculavel;

public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    @Override
    public double precoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        precoHora -= precoHora * (desconto / 100);
    }
}
