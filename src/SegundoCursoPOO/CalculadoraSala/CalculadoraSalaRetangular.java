package SegundoCursoPOO.CalculadoraSala;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double base) {
        double area = base * altura;
        System.out.println("A Area da sala é de: "+area+"m²");
    }

    @Override
    public void calcularPerimetro(double altura, double base) {
        double perimetro = (base + altura) * 2;
        System.out.println("O perimetro da sala é de: "+perimetro+"cm");
    }
}
