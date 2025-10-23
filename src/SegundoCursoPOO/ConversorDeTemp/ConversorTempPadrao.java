package SegundoCursoPOO.ConversorDeTemp;

public class ConversorTempPadrao implements ConversorTemperatura{

    @Override
    public double celciusParaFahrenheit(double tempCelcius) {
        return tempCelcius * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelcius(double tempFahrenheit) {
        return (tempFahrenheit - 32) * 5 / 9;
    }
}
