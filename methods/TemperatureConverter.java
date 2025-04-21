package methods;

import java.util.Scanner;

public class TemperatureConverter {

    /*
     * Objetivo: Criar um conversor de temperatura de Celsius para Fahrenheit e de Fahrenheit para Celsios;

     * Etapas: 
        1- Obter do usuário se ele quer converter de Celsios para Fahrenheit ou o contrário;
        2- Criar duas funções , um para cada conversão;
        3- Obter a temperatura em cada uma das funções escolhidas;
        4- Exibir uma mensagem com a temperatura, Ex: De C para F.
    
        !Obs: Fórmulas
        C = (F - 32) / 1,8
        F = (1.8 * C) + 32
    */

    public static void main(String[] args) {
        inicializeConverter();
    }

    private static void inicializeConverter() {
        Scanner scanner  = new Scanner(System.in);
        
        System.out.println("Olá, bem vindo ao conversor de temperatura");
        System.out.println("Digite ( 1 ) se você quiser transformar de Celsios -> Fahrenheit ou ( 2 ) para Fahrenheit -> Celsios ");

        int converter = scanner.nextInt();
        scanner.nextLine();

        converterTemp(converter);
    }

    /**
     * Responsável por chamar a função de conversão de temperatura correspondente ao parâmetro selecionado
     * @param param
     */
    private static void converterTemp( int param ) {
        Scanner scanner  = new Scanner(System.in);

        double temperature;

        if ( param == 1 ) {
            System.out.println("Muito bem, digite o valor da temperatura que deseja converter: ");
            temperature = scanner.nextDouble();
            
            System.out.println("O resultado de Fahrenheit para Celsios é: " + convertForCelsios(temperature));
        } else if ( param == 2 ) {
            System.out.println("Muito bem, digite o valor da temperatura que deseja converter: ");
            temperature = scanner.nextDouble();

            System.out.println("O resultado de Celsios para Fahrenheit é: " + convertForFahrenheit(temperature));
        } else {
            System.out.println("Opção inválida, tente novamente!");
        }
    }

    /**
     * Função de conversão de Fahrenheit para graus Celsios
     * @param temperature
     * @return Temperatura em Celsios
     */
    private static double convertForCelsios( double temperature ){
        double resultCelsios;

        resultCelsios = ( 1.8 * temperature ) + 32;

        return resultCelsios;
    }

    /**
     * Função de conversão de Celsios para graus Fahrenheit
     * @param temperature
     * @return Temperatura em Fahrenheit
     */
    private static double convertForFahrenheit( double temperature ){
        double resultFahrenheit;

        resultFahrenheit = ( temperature - 32 ) / 1.8;

        return resultFahrenheit;
    }
}