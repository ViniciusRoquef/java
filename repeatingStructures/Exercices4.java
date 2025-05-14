package repeatingStructures;

import java.util.Scanner;

public class Exercices4 {
    public static void main(String[] args) {
        /**
         *? Exercício 1: Somatório com for
         * Crie um programa com for que faça o somatório dos númeoros de 1 a 10 e imprima o resultado.
         * 
         *? Exercício 2: Impressão dos números pares com While
         * Crie um programa que imprima os números pares de 1 a 20 utilizando a estrutura while.
         * 
         *? Exercício 3: Verificação de números primos com for
         * Crie um programa que receba um número do usuário e verifique se ele é primo ou não, utilizando a estrutura for.
         * 
         *? Exercício 4: Menu interativo com While
         * Crie um programa interativo utilizando a estrutura do while que permita que o usuário escolha opções até decidir sair.
         * 
         *? Exercício 5: Fatorial de um número com for
         * Crie um programa que calcule o fatorial de um número fornecido pelo usuário utilizando a estrutura for.
         */

        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        scanner.nextLine();

        sequentialSummary(number);
        printingNumbers(number);
        isCousin(number);
        System.out.println(calculateFactorial(number));
    }

    public static void printingNumbers(int number) {
        while (number < 100 ) {
            number++;

           if (number % 2 == 0 ) {
               System.out.println(number);
           }
        }
    }

    public static void sequentialSummary(int number) {
        for(int num1 = 1; num1 <= 10; num1++) {
            for(int num2 = 1; num2 < num1; num2++) {
                System.out.println("A soma dos números é: " + (num1 + num2));
            }
        }
    }

    public static void isCousin(int number) {
        if (number <= 1) {
            System.out.println("Não é primo");
        } else {
            for (int i = 2; i * i <= number; i += 2) {

                if (number % i == 0) {
                    System.out.println("Não é primo");
                } else {
                    System.out.println(number + " é primo");
                }
            } 
        }
    }

    public static int calculateFactorial(int number) {
        if (number < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        }

        if (number == 0) {
            return 1;
        }

        int factor = 1;

        for (int i = 1; i <= number; i++) {
            factor *= i;
        }
        return factor;
    }

}
