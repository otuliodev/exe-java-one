package SegundoCursoPOO;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificaIdade(){
        if (idade >= 18){
            System.out.println(" é maior de idade");
        } else {
            System.out.println(" é menor de idade");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
