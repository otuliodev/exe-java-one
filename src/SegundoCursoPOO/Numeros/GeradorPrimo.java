package SegundoCursoPOO.Numeros;

public class GeradorPrimo extends NumerosPrimo{
    public int gerarProximoPrimo(int ultimoPrimoConhecido){
        int proximoNum = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNum)){
            proximoNum++;
        }
        return proximoNum;
    }
}
