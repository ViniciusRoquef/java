package methods;

public class BuiltInFunctions {

    public static void main(String[] args) {
        /*
         * Built-in Functions:
            As funções embutidas são funções pré-definidas que estão disponíveis em muitas linguagens de programação, incluindo Java.
            Essas funções são projetadas para realizar tarefas comuns, como manipulação de strings, operações matemáticas e entrada/saída de dados.
            São úteis porque economizam tempo e esforço, permitindo que os programadores se concentrem em tarefas mais complexas.

         * Built-in Funtions for Strings:
            * Principais
            - length(): Retorna o comprimento da string.
            - charAt(int index): Retorna o caractere na posição especificada.
            - substring(int beginIndex, int endIndex): Retorna uma substring da string original.
            - indexOf(String str): Retorna o índice da primeira ocorrência da string especificada.
            - toUpperCase(): Converte a string para maiúsculas.
            - toLowerCase(): Converte a string para minúsculas.
            - trim(): Remove espaços em branco do início e do fim da string.
            - equals(String str): Compara duas strings para verificar se são iguais.
            - split(String regex): Divide a string em partes com base no delimitador especificado.
            - replace(String oldChar, String newChar): Substitui todas as ocorrências de um caractere por outro. 

        * Built-in Functions for Numbers:
            * Principais
            - Math.abs(int a): Retorna o valor absoluto de um número.
            - Math.max(int a, int b): Retorna o maior valor entre dois números.
            - Math.min(int a, int b): Retorna o menor valor entre dois números.
            - Math.sqrt(double a): Retorna a raiz quadrada de um número.
            - Math.pow(double base, double exponent): Retorna a base elevada à potência do expoente.
            - Math.random(): Retorna um número aleatório entre 0.0 e 1.0.

         */

        // Exemplo de uso de funções embutidas para manipulação de strings
        String name = "Vinicius Roque Ferreira da Silva";

        System.out.print(name.toLowerCase());
        linhaEmBranco();
        System.out.print(name.toUpperCase());
        linhaEmBranco();
        System.out.print(name.length());
        linhaEmBranco();
        System.out.print(name.substring(0, 8));
        linhaEmBranco();
        System.out.println(name.trim());
        linhaEmBranco();
        System.out.print(name.substring(0, 8).replace("i", "e"));

        // Exemplo de uso de funções embutidas para operações matemáticas
        int number = -10;
        System.out.print(Math.abs(number));
        linhaEmBranco();
        System.out.print(Math.max(10, 20));
        linhaEmBranco();
        System.out.print(Math.min(10, 20));
        linhaEmBranco();
        System.out.print(Math.sqrt(25));
        linhaEmBranco();
        System.out.print(Math.pow(2, 3));
        linhaEmBranco();    
        System.out.print(Math.random());
        linhaEmBranco();
    }

    public static void linhaEmBranco() {
        System.out.println();
    }
}