package arrays;

import java.lang.reflect.Array;
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

      int[] arrayRepeatedNumbers = {1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6};

      System.out.println("Números repetidos no array:");

      for (int i = 0; i < arrayRepeatedNumbers.length; i++) {
         int count = 0;
         boolean alreadyCounted = false;

         for (int k = 0; k < i; k++) {
               if (arrayRepeatedNumbers[i] == arrayRepeatedNumbers[k]) {
                  alreadyCounted = true;
                  break;
               }
         }

         if (!alreadyCounted) {
               for (int j = 0; j < arrayRepeatedNumbers.length; j++) {
                  if (arrayRepeatedNumbers[i] == arrayRepeatedNumbers[j]) {
                     count++;
                  }
               }

               if (count > 1) {
                  System.out.println(arrayRepeatedNumbers[i] + " aparece " + count + " vezes");
               }
         }
      }

      System.out.println("_____________Exercicio 3 _______________");

      int[][] matrizOriginal = {
            {1, 2},
            {3, 4},
            {5, 6}
      };

      int linhas = matrizOriginal.length;
      int colunas = matrizOriginal[0].length;

      int[][] matrizTransposta = new int[colunas][linhas];

      for (int i = 0; i < linhas; i++) {
         for (int j = 0; j < colunas; j++) {
               matrizTransposta[j][i] = matrizOriginal[i][j];
         }
      }

      System.out.println("Matriz Original:");
      imprimirMatriz(matrizOriginal);

      System.out.println("\nMatriz Transposta:");
      imprimirMatriz(matrizTransposta);

      System.out.println("_____________Exercicio 4 _______________");

      int[] arrayWithValue = { 1, 2, 4, 5, 9, 8 };
      System.out.println("Array com valores originais: " + Arrays.toString(arrayWithValue));
      

      for(int i = 0; i < arrayWithValue.length; i++) {
         arrayWithValue[i] = 0;
      }
      printArray(arrayWithValue);      
   }

   private static void imprimirMatriz(int[][] matriz) {
      for (int[] linha : matriz) {
         for (int elemento : linha) {
            System.out.print(elemento + " ");
         }

         System.out.println();
      }
   }

   private static void printArray(int[] array) {
      for (int num : array) {
         System.out.print(num + " ");
      }
   }

}