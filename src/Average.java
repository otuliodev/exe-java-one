public class Average {
    public static void main(String[] args){
        double notaUm = 5.8;
        double notaDois = 9.0;

        double media = (notaUm + notaDois) / 2;
        System.out.println("Média: "+media);


        double numDouble = 27.9;
        int numInt = (int) numDouble;
        System.out.println("O casting de double para int é: "+numInt);


        char letra = 'M';
        String palavra = "arco Tulio";
        String concat = letra + palavra;

        System.out.println(concat);


        double precoProduto = 5.0;
        int quantidade = 37;

        double total = precoProduto * quantidade;
        System.out.println("Total: "+ total);


        double valorEmDolar = 1500.00;
        double dolar = 4.94;

        double conversao = valorEmDolar * dolar;
        String msgConversao = String.format("A conversão em dola é: %.2f reais", conversao);
        System.out.println(msgConversao);


        double precoOriginal = 440.00;
        double percentualDesconto = 15;

        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("Valor do Produto: "+ precoOriginal);
        System.out.println("Percentual do desconto: "+ percentualDesconto +"%");
        System.out.println("Valor do desconto: "+ valorDesconto);
        System.out.println("Valor total do produto com desconto: "+precoComDesconto);
    }
}
