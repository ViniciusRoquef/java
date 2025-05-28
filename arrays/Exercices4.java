package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercices4 {

    public static void main(String[] args) {
        
        /*
         * Exercício 1: Inverter elementos de um Array
            Crie um programa que receba uum array de inteiros de um usuário e inverta a ordem dos elementos
            Exiba o array original e o array invertido

         * Exercício 2: Encontrar o elemeto mais frequente de um array
            Desenvolva um programa que receba um array de inteiros e determine qual elemento aparece com mais frequência.
            Caso haja empate, exiba todos os elementos empatados.

         * Exercício 3: Transpor uma matriz 2D
            Crie um programa que receba uma matriz 2D e crie uma matriz transposta(troca de linhas e colunas).
            Exiba a matriz original e a matriz transposta

         * Exercício 4: Substituir valores de um array com Condição
            Escreva um programa que receba um array de inteiros e substitua todos os valores por 0.
            Exiba o array antes e depois da modificação

         * Exercício 5: Remover elementos duplicados de um array
            Desenvolva um programa que remova os elementos duplicados de um array de inteiros, mantendo apenas a primeira ocorrência do valor.
            Exiba o array original e o array modificado.
        */
        System.out.println("_____________Exercicio 1 _______________");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá usuário, digite 3 números no terminal abaixo: ");
        
        int[] arrayNumbersForUser = new int[3];

        arrayNumbersForUser[0] = scanner.nextInt();
        scanner.nextLine();
        arrayNumbersForUser[1] = scanner.nextInt();
        scanner.nextLine();
        arrayNumbersForUser[2] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(Arrays.toString(arrayNumbersForUser));

        int[] arrayInverse = new int[3];
        
        for(int i = 0; i < arrayNumbersForUser.length; i++) {
            arrayInverse[i] = arrayNumbersForUser[(arrayNumbersForUser.length - 1) - i];
        }

        System.out.println( "Array invertido: "+ Arrays.toString(arrayInverse));

        System.out.println("_____________Exercicio 2 _______________");

    }
}