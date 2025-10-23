package SegundoCursoPOO.Carro;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;
    String cor;

//    void exibeFichaTecnica(){
//        System.out.println("Modelo: "+modelo);
//        System.out.println("Ano: "+ precoAno1);
//        System.out.println("Cor: "+cor);
//    }
//    int calculaIdade(){
//        return 2025 - precoAno1;
//    }

    public void defineModelo(String modelo){
        this.modelo = modelo;
    }

    public void definePreco(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibeInfo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Preço Ano 1: "+precoAno1);
        System.out.println("Preço Ano 2: "+precoAno2);
        System.out.println("Preço Ano 3: "+precoAno3);
        System.out.println("Menor Preço: "+calcularMenorPreco());
        System.out.println("Maior Preço: "+calcularMaiorPreco());
    }

    private  double calcularMenorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double calcularMaiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }
}
