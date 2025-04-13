package variables;

public class Variables {
    public static void main(String[] args) {
        // tipo -> nome -> atribuição de valor
        String name = "Vinicius R"; 
        
        //  --> 1- Tipos de dados primitivos <--

        //Para validações de controle de estado(true -> false)
        boolean isBollean = true;

        //Para armazenamento de números;
        byte number1 = 0;
        short number2 = 2;
        int number3 = 3;
        long number4 = 4;

        //Para armazenamentoss de números decimais;
        float number5 = 5.0F;
        double number6 = 6.00;

        //Para armazenar caracteres 
        char caracter = 'a';

        //Para armazenar dados em texto, ultullizamos a classe String
        String nameTwo = "Francisco de Assis";


        /*  
            *2- OPERADORES ARITMÉTICOS(Parte 1)
            + = Adição;
            - = Subtração;
            / = Divisão;
            * = Multiplicação;
            % = Módulo 
        */

        System.out.println(number4 + number5 * (number6 / number3) - number1);

        /* 
         *3- OPERADORES ARITMÉTICOS(Parte 2)
            Incremento(++) = Incrementa o valor de uma variável em 1;
            Decremento(--) = Decrementa o valor de uma variável em -1;
            Atribuição aditiva(+=) = Soma e atribui o resultado de uma variável;
            Atribuição subtrativa(-=) = Subtrai e atribui o resultado de uma variável;
        */

        

        /*
            *4- TYPE CASTING <--
            Conversão de tipos de dados, para que possamos armazenar um tipo de dado em outro tipo de dado.
            Exemplo: int -> double, double -> int, float -> int, etc..
        */

        //IMPLICITO(WIDENING CONVERSION) = Conversão de um tipo de dado menor para um tipo de dado maior.
        //Conversão de int para double

        int smallNumber = 4;
        long bigNumber = smallNumber;

        System.out.println(bigNumber);

        //EXPLICITO(NARROWING CONVERSION) = Conversão de um tipo de dado maior para um tipo de dado menor.
        //Conversão de double para int
        double bigDecimal = 4.5;

        int smallDecimal = (int) bigDecimal; //Casting imprime 4s, pois o valor decimal é descartado.

        System.out.println(smallDecimal);

        /*
         * 5- CONTANTES
            Constantes são variáveis que não podem ser alteradas após serem inicializadas.
            Para declarar uma constante, utilizamos a palavra reservada final.
         */

        final int DAYS_FOR_WEEKS = 7;

        System.out.println("O número de dias em uma semana é: " + DAYS_FOR_WEEKS);

        /*
         * 6- VAR 
            O tipo var é uma forma de declarar variáveis em Java, onde o compilador infere o tipo da variável com base no valor atribuído a ela.
            O tipo var só pode ser usado para variáveis locais, não pode ser usado para atributos de classe ou parâmetros de métodos.
         */

        var lastName = "Ribeiro"; //O compilador infere que o tipo da variável é String.
        System.out.println(lastName);
        lastName = "Roque";
        System.out.println(lastName); //Mudou o valor do VAR, pois o compilador identifica que é do mesmo tipo String
    }
}
