package SegundoCursoPOO.Calculavel;

public class Produto implements Vendavel{
    private String nomeProduto;
    private double precoProduto;

    public Produto(String nomeProduto, double precoProduto){
        this.precoProduto = precoProduto;
        this.nomeProduto = nomeProduto;
    }

    public Produto() {

    }

    @Override
    public double precoTotal(int quantidade) {
        return precoProduto * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        precoProduto -= precoProduto *(desconto / 100);
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(int precoProduto) {
        this.precoProduto = precoProduto;
    }
}
