package arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.ArrayList;

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
        System.out.println("____________________________________");

        //Loops em Arrays


        //Usando forEatch para interar sobre loops
        for (String fruit : fruits) {
            System.out.println("A fruta da vez é: " + fruit);
        }
        System.out.println("____________________________________");

        //Usando for
        int soma = 0;
        for(int i = 0; i < numbers.length; i++) {
            soma += numbers[i];
            System.out.println("A soma dos números do array é: " + soma);
        }
        System.out.println("____________________________________");

        //Concatenando frases com for
        String[] palavrasArray = { "Java", "é", "bom!"};
        String phrase = "";

        for (String palavra : palavrasArray) {
            System.out.println( phrase += palavra + ' ');
        }
        System.out.println("____________________________________");


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
        System.out.println("____________________________________");

        String[] courses = {"Javascript", "Java", "PHP", "C++", "Node", "Python"};
        
        String lenguage = "Node";
        for (String course : courses) {
            if (lenguage == course) {
                System.out.println( "A linguagem foi encontrada!" + lenguage);
            }
        }
        System.out.println("____________________________________");

        int limitNumber = 35;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] > limitNumber) {
                System.out.println("Numero maior que o limitNumber(35) " + numbers[i] );
            }
        }
        System.out.println("____________________________________");

        /* 
        * Método toString no arrays
        * mais comulmente usado para debugs em arrays
        */ 

        String arraysList = Arrays.toString(numbers);

        System.out.println(arraysList);


        /*
         * Criando arrays novos, dentro de novos arrays
         * Método comum: Criar um novo array maior e copiar os elemetos, usar o ArrayList para manipulação dinâmica de elementos
        */

        //Adicioando da forma antiga adicionando ao final +1

        int[] newArrayNumber = new int[numbers.length + 1];

        for(int i = 0; i < numbers.length; i++) {
            newArrayNumber[i] = numbers[i];
        }

        System.out.println( "O novo array é: " + Arrays.toString(newArrayNumber));

        newArrayNumber[numbers.length - 1] = 32;

        System.out.println( "O novo array é: " + Arrays.toString(newArrayNumber));

        //Utilizando o método arrayCopy() para copiar dados de um array
        System.out.println("____________________________________");

        String[] novasFrtras = new String[fruits.length + 1];

        System.arraycopy(fruits, 0, novasFrtras, 0, fruits.length);

        System.out.println(Arrays.toString(novasFrtras));


        //Usando o arrayList para copiar e adicionar itens a um array
        System.out.println("____________________________________");
        ArrayList<String> newListFruits = new ArrayList<>(Arrays.asList("Maça", "Uva", "Laranja"));

        System.out.println(newListFruits);

        newListFruits.add("Abacaxi");

        System.out.println(newListFruits);

        System.out.println("____________________________________");
        //Problemas com reference Trap
        // Nada mais é que duas variáveis compartilhando do mesmo espaço de memória

        int[] originalArray = {1,2,3};
        System.out.println(Arrays.toString(originalArray));


        int[] arrayCopy = originalArray;
        arrayCopy[2] = 10;
        System.out.println(Arrays.toString(arrayCopy));

        // - Como evitar? (Usar o método clone())

        int[] arrayClone = originalArray.clone();
        arrayClone[1] = 100;

        System.out.println(Arrays.toString(arrayClone));

        System.out.println("____________________________________");
        /*
         * Array 2D -> Matrizes
         * Criado com a sintaxe ex: int[][] exemple = {}
         * o primeiro [] indica o array a ser acessado e o segundo [] indica o índex dele
         */ 

        int[][] exempleArray2D = {
            { 1, 2, 3, 4 }, 
            { 100, 200, 300 }
        };

        System.out.println(exempleArray2D[1][2]);
        
    }
}
