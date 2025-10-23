package SegundoCursoPOO;

import SegundoCursoPOO.CalculadoraSala.CalculadoraSalaRetangular;
import SegundoCursoPOO.ConversorDeTemp.ConversorTempPadrao;
import SegundoCursoPOO.ConversorDeTemp.ConversorTemperatura;
import SegundoCursoPOO.Tabuada.TabuadaMultiplicacao;

public class Principal {
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa();
//
//        pessoa.exibaOlaMundo();
//
//        Calculadora calc = new Calculadora();
//
//        int resultado = calc.dobreNumero(5);
//        System.out.println(resultado);
//
//        Musica musica = new Musica();
//
//        musica.titulo = "Amina";
//        musica.artista = "Tasha & Tracie";
//        musica.anoLancamento = 2025;
//        musica.exibeFichaTecnica();
//
//        musica.avalia(8);
//        musica.avalia(5);
//        musica.avalia(7);
//        musica.avalia(3);
//        System.out.println("A media de avaliações é de: "+ musica.mediaAvalicao());
//
//        ModeloCarro meuCarro = new ModeloCarro();
//
//        meuCarro.defineModelo("Amarok");
//        meuCarro.definePreco(93.093, 88.611, 73.208);
//        meuCarro.exibeInfo();
//
//        Aluno aluno1 = new Aluno();
//
//        aluno1.nome = "Marco Tulio";
//        aluno1.idade = 20;
//        aluno1.exibaInformacao();
//
//        ContaBancaria conta = new ContaBancaria();
//        conta.depositar(1000);
//        conta.consultarSaldo();
//
//        ContaCorrente contaCorrente = new ContaCorrente();
//        contaCorrente.depositar(200);
//        contaCorrente.cobrarTarifaMensal(15.00);
//        contaCorrente.consultarSaldo();
//        contaCorrente.sacar(50.00);
//        contaCorrente.consultarSaldo();
//
//
//
//        IdadePessoa pessoa2 = new IdadePessoa();
//
//        pessoa2.setNome("Marco Tulio");
//        pessoa2.setIdade(20);
//
//        IdadePessoa pessoa3 = new IdadePessoa();
//
//        pessoa3.setNome("Gabriel");
//        pessoa3.setIdade(22);
//
//        System.out.println(pessoa2.getNome()+" tem "+pessoa2.getIdade()+" anos.");
//        pessoa2.verificaIdade();
//
//        System.out.println(pessoa3.getNome()+" tem "+pessoa3.getIdade()+" anos.");
//        pessoa2.verificaIdade();
//
//        Produto produto = new Produto("Celular", 5000.0);
//
//        System.out.println("Nome do Produto: "+produto.getNomeProduto());
//        System.out.println("Preço: "+produto.getPrecoProduto());
//
//        produto.aplicarDesconto(15);
//        System.out.println("Valor do Produto com Desconto: "+produto.getPrecoProduto());
//
//        Aluno2 joao = new Aluno2("João", 2,4.36,7.2, 6.8);
//        Aluno2 marcos = new Aluno2("Marcos", 5.4, 4.9, 7.1, 8);
//
//        System.out.println("Aluno 1:");
//        System.out.println("Nome: " + joao.getNomeAluno());
//        System.out.println("Nota 1: " + joao.getNota1());
//        System.out.println("Nota 2: " + joao.getNota2());
//        System.out.println("Nota 3: " + joao.getNota3());
//        System.out.println("Nota 4: "+ joao.getNota4());
//        System.out.println("Média: " + joao.calcularMedia());
//        System.out.println();
//
//        System.out.println("Aluno 2:");
//        System.out.println("Nome: " + marcos.getNomeAluno());
//        System.out.println("Nota 1: " + marcos.getNota1());
//        System.out.println("Nota 2: " + marcos.getNota2());
//        System.out.println("Nota 3: " + marcos.getNota3());
//        System.out.println("Média: " + marcos.calcularMedia());
//
//        Livro livro1 = new Livro();
//        livro1.setTitulo("Lógica de Programação");
//        livro1.setAutor("Paulo Silveira");
//
//        Livro livro2 = new Livro();
//        livro2.setTitulo("A lógica do jogo");
//        livro2.setAutor("Marcus Becker");
//
//        livro1.exibirDetalhes();
//        livro2.exibirDetalhes();
//
//        Cachorro charllote = new Cachorro();
//        charllote.emitirSom();
//        charllote.abanarORabo();
//
//        Gato diana = new Gato();
//        diana.emitirSom();
//        diana.arranharMoveis();
//
//        VerificadorPrimo verificador = new VerificadorPrimo();
//        verificador.verificarSeEhPrimo(17);
//
//        GeradorPrimo gerador = new GeradorPrimo();
//        int proximoPrimo = gerador.gerarProximoPrimo(17);
//        System.out.println("O proximo primo apos 17 é: "+proximoPrimo);
//
//        NumerosPrimo numerosPrimo = new NumerosPrimo();
//        numerosPrimo.listarPrimos(30);
//
//        ConversorMoeda conversorMoeda = new ConversorMoeda();
//        conversorMoeda.converterDolarParaReal(50);

        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
        salaRetangular.calcularArea(10.0, 25.5);
        salaRetangular.calcularPerimetro(9.8, 23.0);

        TabuadaMultiplicacao tabuadaMulti = new TabuadaMultiplicacao();
        tabuadaMulti.mostrarTabuada(3);

        ConversorTemperatura conversorTemp = new ConversorTempPadrao();
        double tempCelcius = 25;
        double tempFahrenheit = conversorTemp.celciusParaFahrenheit(tempCelcius);
        System.out.println(tempCelcius +" Celsius é igual a "+tempFahrenheit+" Fahrenheit");

        tempFahrenheit = 77;
        tempCelcius = conversorTemp.fahrenheitParaCelcius(tempFahrenheit);
        System.out.println(tempFahrenheit +" Fahrenheit é igual a "+tempCelcius+" Celcius");
    }
}
