package PrimeiroCurso;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2025;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.9;
        String tipoDoPLano = "normal";

        if (anoDeLancamento >= 2020){
            System.out.println("Lançamentos mais assistidos!");
        } else {
            System.out.println("Filmes retrô que valem a pena assistir!");
        }

        if (incluidoNoPlano || tipoDoPLano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
