package methods;

import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {

        /*
        * EXERCÍCICO 1: CONVERSOR DE TEMPERATURA
            Crie uma função que converta temperatura Celsios para Fahrenheit;
            A função deve receber a temperatura em celsios como argumento e retornar a temperatura em Fahrenheit.
            Exiba o resultado encapsulado em uma variável.

        *EXERCÍCIO 2: fUNÇÃO PARA CALCULAR O FATORIAL DE UM NÚMERO
            Crie uma função para calcular o fatorial de um número inteiro positivo.
            Teste a função com um número da sua escolha.

        *EXERCÍCIO 3: FUNÇÃO COM IF ELSE PARA VERIFICAR  A PARIDADE DE NÚMEROS
            Crie uma função para verificar a paridade de números utilizando a entrada do usuário com um núero solitidado

        *EXERCÍCIO 4: FUNÇÃO COM SWITCH PARA VERIFICAR PARA CLASSIFICAR NOTAS
            Crie uma função para que receba uma nota de 0 a 10;
            de 10 e 9: A, 8: B, 7: C, 6: D e restante F;
            e retorne uma classificação de letra (A, B, C, D, F) usando um switch. 
            Inclua uma verificação para garantir que a nota está dentro do intervalo válido.

        *EXERCÍCIO 5: USE O SYSTEM.EXIT() PARA VERIFICAR A IDADE;
            Crie uma função que receba a idade de uma pessoa;
            Se a idade for menor que 18, use o System.Exit(0) para ecerrar o programa com a messagem "Acesso negado".
            Caso contrário, exiba a mensagem "Acesso permitido".
        
        *EXERCÍCIO 6(DESAFIO): FUNÇÃO QUE RECEBE UM ARRAY E RETORNA O MAIOR NÚMERO
            Cria uma função que receba um array de inteiros e retorne o maior número presente no array.
            Realize um loop para percorrer todos os itens do array e retornar o maior número.
         */

        System.out.println(dayForWeek(3));

        System.out.println(authentication("admin", "Mudar@123"));

        Scanner scanner = new Scanner(System.in);

        //exercício 1
        System.out.println("Digite a uma temperatura em ºC: ");
        double celsiosTemp = scanner.nextDouble();
        scanner.nextLine();
        temperatureConverter(celsiosTemp);

        //exercício 2
        System.out.println("Digite um número para saber seu fatorial: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        factorialNumber(number);

        //exercício 3
        System.out.println("Digite um número e descubra se ele é par: ");
        int isNumberEven = scanner.nextInt();
        scanner.nextLine();
        isEven(isNumberEven);

        //exercício 4
        System.out.println("Digite sua nota e descubra sua classificação: ");
        int grade = scanner.nextInt();
        scanner.nextLine();
        gradeClassification(grade);

        //Exercício 5
        greatestNumber();

        //Exercício 6
        System.out.println("Digite um número de 1 a 7: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        gradeClassification(day);

        //Exercício 7
        System.out.println("Digite o nome do usuário: ");
        String user = scanner.nextLine();
        scanner.nextLine();
        String password = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        authentication(user, password);

        //exercício 8
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        ageValidade(age);
}

    /**
     * Método que converte temperatura Celsius para Fahrenheit(°F = °C × 1,8 + 32)
     * @param c Parâmetro em celsios.
     * @return Exibe texto com a conversão de temperatura.
    */
    public static void temperatureConverter( double c) {
        double fahrenheitTemp;
        fahrenheitTemp = (c * 1.8) + 32;
        System.out.println("A temperatura " + c + " convertida em fahrenheit é: " + fahrenheitTemp);
    }

    //Exercício 2: função para calcular o fatorial de um número inteiro positivo

    public static void factorialNumber(int number) {
        long result = 1;

        for( int i = 1 ; i <= number; i++ ) {
            result = result * i;
        }

        System.out.println("O fatorial do número "+ number+ " é: " + result);
    }

    /**
     * Método para descobrir se o número é par
     * @param number
     * @return retorna no console a resposta se o múmero é par ou ímpar
     */
    public static void isEven(int number) {
        if( number % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }

    public static void gradeClassification( int value ) {
        switch (value) {
            case 10:
            System.out.println("Nota A");
            break;
            
            case 9:
            System.out.println("Nota A");
            break;
            
            case 8:
            System.out.println("Nota B");
            break;
            
            case 7:
            System.out.println("Nota C");
            break;
            
            case 6:
            System.out.println("Nota D");
            break;
            
            case 5:
            System.out.println("Nota F");
            break;
            
            case 4:
            System.out.println("Nota F");
            break;
            
            case 3:
            System.out.println("Nota F");
            break;
            
            case 2:
            System.out.println("Nota F");
            break;
            
            case 1:
            System.out.println("Nota F");
            break;
            
            case 0:
            System.out.println("Nota F");
            break;

            default:
            System.out.println("As notas são classificadas de 0 a 10");
            break;
        }
    }

    /**
     * Descobre qual é o maior índice do array pré-definido
     * @param numArray
     */
    public static void greatestNumber() {
        int[] arrayNumber = { 12, 78, 32, 90, 54, 34, 43 };
        int maior = arrayNumber[0];

        for(int i = 0; i < arrayNumber.length; i++){
            if (arrayNumber[i] > maior) {
                maior = arrayNumber[i];
            }
        }

        System.out.println("Maior número: " + maior);
    }

    /**
     * Retorna o dia respectivo a entrada no console
     * @param numberOfDay
     * @return retorna o nome do dia
     */
    public static String dayForWeek(int numberOfDay ) {
        switch (numberOfDay) {
            case 1:
            return "Domingo";
            
            case 2:
            return "Segunda-feira";
            
            case 3:
            return "Terça-feira";
            
            case 4:
            return "Quarta-feira";
            
            case 5:
            return "Quinta-feira";
            
            case 6:
            return "Sexta-feira";

            case 7:
            return "Sábado-feira";
            
            default:
            return "Inválido, digite um número de 1 a 7.";
        }   
    }

    /**
     * Método que realiza a autenticação do usuário
     * @param user 
     * @param password
     * @return Retorna se o usuário foi logado ou não
     */
    public static String authentication( String user, String password ) {
        if ( !user.equals("admin") && !password.equals("Mudar@123") ) {
            System.out.println("Autenticação falhou, tente novamente");
            System.exit(0);
        }

        return "Bem vindo " + user;
    }

    /**
     * Retorna se o usuário pode acessar ou não o sistema pela sua idade
     * @param age
     * 
     */
    public static void ageValidade(int age) {
        if( age >= 18) {
            System.out.println("Acesso permitido");
        }

        System.exit(0);
    }
}
