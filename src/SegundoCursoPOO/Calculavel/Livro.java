package SegundoCursoPOO.Calculavel;

public class Livro extends Produto implements Calculavel{
    private String titulo;
    private String autor;

    public void exibirDetalhes(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoProduto() * 0.9;
    }
}
