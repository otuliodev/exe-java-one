package SegundoCursoPOO.Animal;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au Au Au!");
    }

    public void abanarORabo(){
        System.out.println("Cachorro abanando o rabo!");
    }
}
