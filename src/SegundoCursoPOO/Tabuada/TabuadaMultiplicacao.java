package SegundoCursoPOO.Tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int num) {
        System.out.println("A tabuada de multiplicação do "+num+":");
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num+" x "+i+" = "+resultado);
        }
    }
}
