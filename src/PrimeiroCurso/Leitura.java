package PrimeiroCurso;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu filme favorito?");
        String nomeFilme = sc.nextLine();
        System.out.println("Qual o ano de lançamento dele?");
        int anoDeLançamento = sc.nextInt();
        System.out.println("Qual a avaliação do filme?");
        double avaliacao = sc.nextDouble();

        System.out.println(nomeFilme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);

        sc.close();
    }
}
