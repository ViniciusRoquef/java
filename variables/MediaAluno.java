package variables;

import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {

        /*
         * Obtenha o nome do aluno e 3 notas;
         * Exiba a mensagem com nome e média final;
         * Bônus: se a média for maior ou igual a 7 , imprima 'APROVADO', caso seja menor, imprima 'REPROVADO';
         */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome: ");
        String studantName = scanner.nextLine();

        System.out.println(studantName + " Me fale sua primeira nota: ");
        double noteOne = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(studantName + " Me fale sua segunda nota: ");
        double noteTwo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println(studantName + " Me fale sua terceira nota: ");
        double noteThree = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        double average = ( noteOne + noteTwo + noteThree ) / 3;

        if (average >= 7.0 && average <= 10.0) {
            System.out.println(studantName +" sua média é: "+ average + ".Você está APROVADO, meus parabéns!");
        } else {
            System.out.println(studantName +" sua média é: "+ average + ".Você foi REPROVADO, ano que vem nos encontramos!");
        }
    }
}
