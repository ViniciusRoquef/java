package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        /*
         * Introdução a Operadores de comparação:
         * == (igual a): Verifica se dois valores são iguais mas não garante sempre o valor correto, por isso é bom utilizar o método equals() para comparar valores;
         * != (Diferente de): Verifica se dois valores são diferentes um do outro;
         * > (Maior que): Verifica se um valor é maior que o outro valor;
         * < (Menor que): Verifica se um valor é maior que o outro valor;
         * >= (Maior ou igual a): Verifica se um valor é maior ou igual a outro valor da direita;
         * <= (Menor ou igual a): Verifica se um valor é menor ou igual o outro valor da direita;
         */

        System.out.println(10 == 10); // true
        System.out.println(10 <= 10); // true
        System.out.println(10 > 10);  // false
        System.out.println(10 >= 10); // true
        System.out.println(10 != 10); // false

        //1- Comparador de Strings

        String name1 = "Java";
        String name2 = new String("Java");

        System.out.println(name1 == name2); //Retorna false: erro do operador ==

        System.out.print(name1 == "Java"); //Retorna true

        System.out.println(name1.equals(name2)); // Retorna true, pois a comparação de valor é igual


        /*
         * ESTRUTURAS CONDICIONAIS
         * if: Executa um bloco de código se a condição for verdadeira;
         * else: Executa um bloco de código alternativo se a condição do if for falsa;
         * else if: Verifica outra condição se as condições anteriors forem falsas;
         * switch: Seleciona e executa um bloco de código entre várias opções com base no valor da expressão (Utilizados em casos com valores mais concretos/fixos);
        
            Importante --> Todas essas estruturas permitem controlar o fluxo de execução com base em condiçõess lógicas. 
         */

        System.out.println( "_______ Calcula IMC ________" );
        
        // *Exemplo para calcular IMC( A fórmula é IMC = peso / (altura x altura) )

        double height = 1.78;
        double weight = 73;

        double imc = weight / (height * height);

        System.out.println( "O seu IMC é: " + imc );

        if ( imc <= 18.5 ) {
            System.out.println("Você está abaixo do peso");
        } else if ( imc >= 18.5 && imc <= 24.5 ) {
            System.out.println("Você está dentro dos padrões de normalidade");
        } else if ( imc >= 25 && imc <= 29.9 ) {
            System.out.println("Você possui obesidade grau I");
        } else if ( imc >= 30 && imc <= 34.9 ) {
            System.out.println("Você possui obesidade grau II");
        } else {
            System.out.println("Você possui obesidade grau III");
        }
    }
}
