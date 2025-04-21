package methods;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        /*
         * Objetivo: Criar um contador de palavras de uma frase

         * Etapas: 
            1 - Receber uma frase do usuário;
            2 - Contar as palavras de uma frase e exibir o resultado;
            3 - Perguntar ao usuário se quer digitar uma nova frase;
            4 - caso não queira, encerrar o programa.
         */

        initializingCounter();
    }

    private static void initializingCounter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá sou um contador de palavras, digite uma frase abaixo para que eu possa contabilizar: ");
        String phrase = scanner.nextLine();

        wordCounter(phrase);
    }

    /**
     * Contabiliza a quantidade de palavras de uma frase
     * @param phrase
     */
    private static void wordCounter(String phrase) {
        Scanner scanner = new Scanner(System.in);

        if (phrase != "" || phrase != null) {
            String[] words = phrase.split(" ");

            int countWords = words.length;    
            System.out.println("O número de palavras é: " + countWords);

            System.out.println("Você quer digitar uma nova frese? Digite [ 1 ] Sim ou [ 2 ] para Não");
            int param = scanner.nextInt();

            resettingCounter(param);
        } else {
            System.out.println("Digite uma frase para que possa contabilizar");
            initializingCounter();
        }
    }
    
    /**
     * Reinicializa o programa caso digite 1
     * @param param
     */
    private static void resettingCounter(int param) {
        switch (param) {
            case 1:
                initializingCounter();
                break;
            case 2: 
                System.out.print("Encerrrando programa...");
                System.exit(0);
            default:
                System.out.println("Digite um valor válido. Tente novamente!");
                System.exit(0);
        }
    }
}
