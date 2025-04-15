package conditionals;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
         * OPERADORES LÓGICOS 
         * && ( E lógico ): Retorna true se ambas as partes forem verdadeiras;
         * || ( OU lógico ): Retona true e alhuma das partes tiver valor true;
         * ! ( Não lógico ): Inverte o valor lógico. Ex: retorna true se o valor for false.
         * Combinação: Pode-se combinar múltiplas condições em uma única expressão lógica.
         */

        //Exercício: DDD dos Estados do Nordeste;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String firstName = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String lastName = scanner.nextLine();


        if (firstName == null && lastName != null ) {
            System.out.println("O Seu nome é obrigatório!");
        } else if (firstName != null && lastName != null ) {
            System.out.println("Olá " + firstName + " digite sua idade: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age >= 18 && age <= 60) {
                System.out.println("Hum, você é maior de idade, está no lugar certo");
                System.out.println("Em que capital nordestina você se encontra?");

                String city = scanner.nextLine();

                switch (city) {
                    case "João Pessoa":
                        System.out.println("Ai que maravilha em Jão Pessoa, seu DDD é (83), bjs!");
                        break;
                    case "Natal": 
                        System.out.println("Ai que maravilha em Natal, seu DDD é (84), bjs!");
                        break;
                    case "Recife": 
                        System.out.println("Ai que maravilha em Recife, seu DDD é (81), bjs!");
                        break;
                    case "Salvador": 
                        System.out.println("Ai que maravilha em Salvador, seu DDD é (71), bjs!");
                        break;
                    case "Maceió": 
                        System.out.println("Ai que maravilha em Maceió, seu DDD é (82), bjs!");
                        break;
                    case "São Luís": 
                        System.out.println("Ai que maravilha em São Luís, seu DDD é (98), bjs!");
                        break;
                    case "Fortaleza": 
                        System.out.println("Ai que maravilha em Fortaleza, seu DDD é (85), bjs!");
                        break;
                    case "Teresina": 
                        System.out.println("Ai que maravilha em Teresina, seu DDD é (86), bjs!");
                        break;
                    case "Aracaju": 
                        System.out.println("Ai que maravilha em Aracaju, seu DDD é (79), bjs!");
                        break;
                    default: 
                        System.out.println("Desculpe, este programa foi feito apenas para as capitais, bjs!");
                        break;
                }
            } else System.out.println("Cai fora garoto, não há nada para você aqui");
        } else System.out.println("Você digitou algo errado, tente novamente.");
        
    }
}
