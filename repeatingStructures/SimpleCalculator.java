package repeatingStructures;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        /*
         * Exercício: Criar uma calculadora que faz soma, subtração, multiplicação e divisão
            Pedir 2números ao usuário(double);
            Resgatar a operação que o usuário solicitou;
            Realizar o cálculo;
            Exibir o resultado;
            Se a opção escolhida for inválida, exiibir mensagem de erro;
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo usuário, digite dois números para dar continuidade: ");

        double number1 = scan.nextDouble();
        scan.nextLine();
        double number2 = scan.nextDouble();
        scan.nextLine();

        calculator(number1, number2);

        
    }
    /**
     * Calculadora simples
     * @param number1
     * @param number2
     */
    private static void calculator(double number1, double number2) {
        System.out.println("Qual operação você deseja, digite o número correspondente");
        System.out.println("( 1 )- Adição");
        System.out.println("( 2 )- Subtração");
        System.out.println("( 3 )- Multiplicação");
        System.out.println("( 4 )- Divisão"); 

        Scanner scan = new Scanner(System.in);
        int numberOperational = scan.nextInt();

        switch (numberOperational) {
            case 1:
                System.out.println( "Resultado: " + (number1 + number2) );
                break;
            case 2:
                System.out.println( "Resultado: " + (number1 - number2) );
                break;
            case 3:
                System.out.println( "Resultado: " + (number1 * number2) );
                break;
            case 4:
                System.out.println( "Resultado: " + (number1 / number2) );
                break;
        
            default:
                System.out.println("Número inválido, tente novamente!");
                break;
        }
    }
}
