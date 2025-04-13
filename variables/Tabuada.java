package variables;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*
         * Projeto Tabuada
         * Receba um número no Scanner e retorne a tabuada do mesmo.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int number = scanner.nextInt();
        System.out.println("Tabuada do " + number + ": ");

        for(int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}