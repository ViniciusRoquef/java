package conditionals;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // *Exemplo para calcular IMC( A fórmula é IMC = peso / (altura x altura) )

        System.out.println("Digite sua altura em cm: ");
        int height = scanner.nextInt();
        scanner.nextLine();
        double heightInMeters = height / 100.0;

        System.out.println("Digite seu peso em kg: ");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        double imc = weight / ( heightInMeters * heightInMeters );

        System.out.println( "O seu IMC é: " + imc );

        if ( imc <= 18.5 ) {
            System.out.println("Você está abaixo do peso");
        } else if ( imc >= 18.5 && imc <= 24.5 ) {
            System.out.println("Você está dentro dos padrões de normalidade");
        } else if ( imc >= 25 && imc <= 29.9 ) {
            System.out.println("Você possui obesidade grau I");
        } else if ( imc >= 30 && imc <= 34.9 ) {
            System.out.println("Você possui obesidade grau II");
        } else {
            System.out.println("Você possui obesidade grau III");
        }
    }
}
