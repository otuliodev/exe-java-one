package PrimeiroCurso;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a avaliação do filme?");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }

        String msgMediaAvaliacao = String.format("Media de avaliações é de: %.1f", mediaAvaliacao/3);
        System.out.println(msgMediaAvaliacao);

    }
}
