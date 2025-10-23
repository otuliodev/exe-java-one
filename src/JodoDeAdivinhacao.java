import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class JodoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int chute = 0;

        while (tentativas < 5){
            System.out.println("Digite um numero entre 0 e 100");
            chute = sc.nextInt();
            tentativas++;

            if (chute == numAleatorio){
                System.out.println("Parabens! Você acertou o numero em "+tentativas+" tentativas");
                break;
            } else if (chute < numAleatorio){
                System.out.println("Errou! O Numero aleatorio é maior");
            } else {
                System.out.println("Errou! O numero aleatorio e menor");
            }
        }
        if (tentativas == 5 && chute != numAleatorio){
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numAleatorio);
        }
    }
}
