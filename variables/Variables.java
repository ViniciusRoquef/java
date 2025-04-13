package variables;

public class Variables {
    public static void main(String[] args) {
        // tipo -> nome -> atribuição de valor
        String name = "Vinicius R"; 
        
        //  --> Tipos de dados primitivos <--

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


        // --> OPERADORES ARITMÉTICOS(Parte 1)
        // + = Adição;
        // - = Subtração;
        // / = Divisão;
        // * = Multiplicação;
        // % = Módulo

        System.out.println(number4 + number5 * (number6 / number3) - number1);

        // --> OPERADORES ARITMÉTICOS(Parte 2)
        //Incremento(++) = Incrementa o valor de uma variável em 1;
        //Decremento(--) = Decrementa o valor de uma variável em -1;
        //Atribuição aditiva(+=) = Soma e atribui o resultado de uma variável;
        //Atribuição subtrativa(-=) = Subtrai e atribui o resultado de uma variável;

        
    }
}
