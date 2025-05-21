package arrays;

import java.sql.Array;

public class Lists {
    public static void main(String[] args) {
        
        //!Arrays => subs. e classe Array

        //Sintaxe de um array: 

        int[] numbers = { 23, 30, 3, 50, 60 };

        System.out.println(numbers[2]);

        String[] fruits = new String[5];

        fruits[0] = "Banana";
        fruits[1] = "Amora";
        fruits[2] = "Morango";
        fruits[3] = "Cajá";
        fruits[4] = "Uva";

        System.out.println(fruits[3]);

        //Loops em Arrays


        //Usando forEatch para interar sobre loops
        for (String fruit : fruits) {
            System.out.println("A fruta da vez é: " + fruit);
        }

        //Usando for
        int soma = 0;
        for(int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
            System.out.println("A soma dos números do array é: " + soma);
        }

        //Concatenando frases com for
        String[] palavrasArray = { "Java", "é", "bom!"};
        String phrase = "";

        for (String palavra : palavrasArray) {
            System.out.println( phrase += palavra + ' ');
        }


        //?For vs ForEach
        /*
         * o For éusado quando você pprecisa fazer manipulação de índices, ouu quando você precisa interroper o loop em uma pposição específica.
         * O ForEach é usado quando você quer apenas iterar sobre os elementos de um array ou coleção, sem se preocupar com os índices.
         * O ForEach é mais legível e menos propenso a erros, pois não requer o controle manual dos índices.
         */

        //Loop com condicionais

        //Ex: somando números pares
        int sum = 0;
        for(int number: numbers) {
            if ( number % 2 == 0) {
                sum += number;
                System.out.println("A soma dos números é: " + sum);
            }
        }

        String[] courses = {"Javascript", "Java", "PHP", "C++", "Node", "Python"};
        
        String lenguage = "Node";
        for (String course : courses) {
            if (lenguage == course) {
                System.out.println( "A linguagem foi encontrada!" + lenguage);
            }
        }
    }
}
