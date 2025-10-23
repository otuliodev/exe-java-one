package SegundoCursoPOO.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return getPrecoProduto() * 1.05;
    }
}
