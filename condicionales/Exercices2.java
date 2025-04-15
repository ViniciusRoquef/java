package condicionales;

import java.util.Scanner;

public class Exercices2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("____Exercício 1 ____");

        /*
            * EXERCÍCIO 1: VERIFICAÇÃO DE CATEGORIA DE PREÇOS
            Peça para o usuário inserir o preço de um produto;
            Se o preço for menor que 50, categorize-o como barato;
            Caso esteja entre 50 e 10 reais, categorize-o como médio;
            Se for maior que 100, categorize-o como caro. Exiba a categora correspondente.
         */
        System.out.println("Insira o preço do produto: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println( "Preço digitado: " + price );

        if ( price < 50 ) {
            System.out.println("O produto está barato");
        } else if( price >= 50 && price <= 100) {
            System.out.println("O produto está com preço médio");
        } else {
            System.out.println("O produto está caro");
        }
        
        
        System.out.println("____Exercício 2 ____");
        /*
             * EXERCÍCIO 2: VALIDAÇÃO DE LOGIN
            Peça para o usuário inserir um nome e uma senha;
            Verifique se o nome do usuário é "admin" e a senha é "1234";
            Se ambos forem corretos, exiba a mensagem "Acesso permitido";
            Caso contrário, exiba "Acessso negado"
        */
        System.out.println("Olá, digite seu nome de usuário: ");
        String user = scanner.nextLine();

        System.out.println("Olá, digite sua senha: ");
        int password = scanner.nextInt();


        if ( user.equals("admin") && password == 1234 ) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();

        /*
            *Exercício 3: Identificação de Paridade com Strings
            Peça ao usuário para inserir um número. 
            Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar". 
            Use uma string para armazenar o resultado e exibi-la.
            Depois de avaliar o número, tu vai colocar se é par ou impar em uma var.
            
         */

        /*
            * Exercício 4: Identificação de Dia Útil
            Peça ao usuário para inserir um número de 1 a 7, 
            representando os dias da semana (1 para domingo, 2 para segunda, etc.). 
            Use switch para verificar se o dia é um dia útil (segunda a sexta) 
            ou final de semana (sábado e domingo). 
            Exiba uma mensagem correspondente.
            
        */

        /*
            * Exercício 5: Verificação de Intervalo com AND
            Peça ao usuário para inserir um número. 
            Verifique se o número está no intervalo de 10 a 20, inclusive. 
            Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba "Fora do intervalo".
         */

        /*
            *  Exercício 6: Classificação de Letra
            Peça ao usuário para inserir uma letra. 
            Verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. 
            Exiba "Vogal" ou "Consoante" de acordo com a entrada. 
            Considere tanto letras maiúsculas quanto minúsculas. 
         */


    }
}
