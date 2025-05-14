package repeatingStructures;

public class Contepts {

    public static void main(String[] args) {
        /*
         * Utilizando o a estrutura FOR
            - For é utilizado quando você sabe quantas vezes vai ser neecessário rodar o loop, caso você não tenha noção, é melhor que utilize o While;
            Estrutura: 
            1 - variável de inicialização;
            2 Condição: determina até quando ou quantas vezes o loop irá rodar;
            3 Incremento: A variável vai chegar na condição
        */

        
        for(int i = 1; i <= 6; i++) {
            System.out.println("A contagem de i é: " + i);
        }

        //Contagem de letras de uma palavra
        String name = "Vinicius";

        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        //Contagem regressiva
        for(int i = 9; i > 0; i--) {
            System.out.println(i);
        }

        // 2 - While

        int e = 0;

        while (e <= 8) {
            e++;

            System.out.println("A nova contagem de i é: " + e);
        }

        // 3 - Break
        // Pode ser usado em qualquer estrutura de loop

        for(int t = 0; t <= 10; t++) {
            System.out.println("O número de t é: " + t); 

            if (t == 5) {
                System.out.println("Parando LOOp");
                break;
            }
        }

        //4 - Continue
        // Continue é uma instrução que interrompe a iteração atual de loop e pula para a próxima, ignorando o restante do código dentro do bloco loop para aquela interação.
        
        for(int f = 0; f <= 12; f++) {
            if (f % 2 == 0 ) {
                System.out.println("Par");
                continue;
            }

            System.out.println(" O número ímpar de f é: " + f);
        }

        //5-nested loop
        // Um loop dentro do outro, o loop interno é executado completamente para cada iteração do loop externo.

        for(int i = 0; i < 3; i++) {
            System.out.println("Loop externo: " + i);

            for(int j = 0; j < 2; j++) {
                System.out.println("Loop interno: " + j);
            }
        }
    }
}