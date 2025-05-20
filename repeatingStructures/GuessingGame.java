package repeatingStructures;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        
        /*
         * Exercício 2: Jogo da adivinhação
            Criar um número aleatório;
            Pedir uum para o usuário;
            Salvar as tentativas que foram usadas;
            Enquanto o usuário não acertar, exibir se o número é maior ou menor que o número criado;
            Colocar um total de 40 tentativas;
            Exibir a mnsagem de sucsso ao acertar, incluindo a quantidade de tentativas.
         */

        Random random = new Random();

        int randomNumber = random.nextInt(100);

        System.out.println("Esse é o jogo da advinhação, digite um número inteiro e tente acertar: ");

        guessingGame(randomNumber);
    }

    /**
     * Jogo da advinhação
     * @param randomNumber
     */
    public static void guessingGame(int randomNumber) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        externo: 
        for(int i = 0; i <= 40; i++){
            int number = scanner.nextInt();
            attempts++;

            if (number == randomNumber) {
                System.out.println("Você acertou na tentativa: " + attempts);
                break externo;
            } else if ( number < randomNumber) {
                System.out.println("Você errou, o número é MAIOR que o digitado.");
            } else if (number > randomNumber) {
                System.out.println("Você errou, o número é MENOR que o digitado.");
            } 
            continue externo;
        }   
    }
}
