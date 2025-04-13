package variables;

public class Exercises1 {

    public static void main(String[] args) {

        /*
        * Exercício 1: 
            Crie uma variável int para armazenar o valor 10.
            Crie uma segunda variável int que armazene o dobro do valor da segunda variável usando operadores aritméticos.
            Exiba o resultado na tela.
        */
        int number = 10;
        int numberTwo = number * 2;
        System.out.println("O dobro de " + number + " é: " + numberTwo);

        /*
         * Exercício 2:
            Crie uma variável CHAr que armazene uma letra.
            Faça o casting explícito dessa variável para int e exiba o resultado na tela.
        */

        char letter = 'B';
        int intLetter = (int) letter;

        System.out.println("O valor numérico de " + letter + " é: " + intLetter);

        /*
         * Exercício 3: 
            Declare duas variáveis double para armazenar o valor de 15.5 e 30.7
            Some os valores dessas variáveis e armazene os resultados em uma nova variável double.
            Exiba o resultado na tela.
         */

        double numberThree = 15.5;
        double numberFour = 30.7;

        double sumNumbers = numberThree + numberFour;

        System.out.println("A soma de " + numberThree + " e " + numberFour + " é: " + sumNumbers);

        /*
         * Exercício 4: 
            Declare uma variável long para armazenar o número 2 bilhões(2_000_000_000).
            Em seguida, declare uma variável int e faça casting explicito para armazenar o valor de long para int;
            Exiba o resultado na tela.
         */

        long bilionNumber = 2_000_000_000L;
        int intBilionNumber = (int) bilionNumber;

        System.out.println("O valor de " + bilionNumber + " em int é: " + intBilionNumber);

        /*
         * Exercício 5: 
            Declare uma variável float para armazenar o valor 10.5F.
            Em seguida, declare uma variável double e faça casting implícito para armazenar o valor de float para double;           
            Exiba o resultado na tela.
         */
        float floatNumber = 10.5F;
        double doubleNumber = floatNumber;          

        System.out.println("O valor de " + floatNumber + " em double é: " + doubleNumber);
    }
}