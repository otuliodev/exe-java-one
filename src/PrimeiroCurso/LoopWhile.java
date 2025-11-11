package PrimeiroCurso;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;


        while (nota != -1) {
            System.out.println("Qual a avaliação do filme?");
            nota = sc.nextDouble();
            if (nota != -1){
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        String msgMediaAvaliacao = String.format("Media de avaliações é de: %.1f", mediaAvaliacao/totalNotas);
        System.out.println(msgMediaAvaliacao);
    }
}
