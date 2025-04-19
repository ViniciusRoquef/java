package methods;

public class Functions {

    /*
     * Documentação das funções: 
        Fornece informações detalhadas sobre o que a função faz, seus parâmetros, valores de retorno e outros detalhes importantes;
        Utiliza o formato Javadoc para gerar uma documentação automática e legível que pode ser visualizada em IDES;
        Facilita a compreensão e manutenção de código.
    
     * Componentes da documentação: 
        Descrição geral: Explica o que a função faz e o seu propósito;
        Parâmetros(@param): usado para indicar os parâmetros de entrada, incluindo os tipos que o representam;
        Valor de retorno(@return): descreve o que a função retorna, se aplicável;
        Excessões(@throws): indica quais excessões a função pode lançar, se houver.
     */

    public static void main(String[] args) {
        sum(5, 6);
        sum(4, 12);
        sum(13, 15);

        //*Return nas funções
        duplicateNumber(4);

        //*Encapsulamento de funções
        double result = divideNumber(doubleNumber(4));
        System.out.println("O resultado da função é: " + result);
    }

    //1- Argumentos de funções 
    // os argumentos são os valores que passamos para a função, e os parâmetros são as variáveis que recebem esses valores dentro da função.
    // Exemplo: soma(5, 6); aqui 5 e 6 são os argumentos, e a função soma tem dois parâmetros (int a, int b).
    public static void sum(int a, int b) {
        int resultado = a + b;

        System.out.println("O resultado da função soma é: " + resultado);
    }

    //2- Retorno de funções
    // O retorno de uma função é o valor que ela devolve após a execução.
    // Isso é útil quando queremos usar o resultado da função em outro lugar do código.

    public static int duplicateNumber( int number) {
        return number * 2;
    }

    //3- Encapsulamento de funções
    // O encapsulamento de funções é o processo de esconder a implementação interna de uma função,
    // permitindo que ela seja usada sem expor detalhes desnecessários.
    // Isso ajuda a manter o código mais organizado e fácil de entender.

    public static int doubleNumber(int number) {
        return number * 2;
    }

    public static double divideNumber(int number) {
        return number / 2.0;
    }


    /**
     * Método responsável pela média de notas
     * 
     * @param assessmentOne Primeiro número/nota a ser enviado
     * @param assessmentTwo Segundo número/nota a ser enviado
     * @param assessmentThree Terceiro número/nota a ser enviado    
     * @return Resultado entre a média das três notas
     */
    public static double calculateAverage(
        double assessmentOne, 
        double assessmentTwo,
        double assessmentThree
    ) {
        return (assessmentOne + assessmentTwo + assessmentThree) / 3;
    }

}