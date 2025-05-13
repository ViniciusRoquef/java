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

        for(int i = 0; i <= name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        //Contagem regressiva
        for(int i = 9; i > 0; i--) {
            System.out.println(i);
        }
    }
}