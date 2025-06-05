package indroductionOOP;

public class Car {

    //Definir primeiro as propriedades de uma classe, pois sem elas a classe não é funcional
    
    String name;
    String model;
    String mark;
    int ageFrabrication;

    double currentSpeed;
    boolean isEngineRunning;


    //Métrodos: São funções que realizam tarefas deiversas de acordo com as característivas da classe

    void showCar() {
        System.out.println("O nome do carro é " +  mark + name + ", ano de fabricação " + ageFrabrication);
    }

    void starEngine() {
        if(!isEngineRunning) {
            isEngineRunning = true;
            System.out.println("Motor ligado!");
        } else {
            System.out.println("Motor desligado");
        }
    }

    void velocity(double increment) {
        if (isEngineRunning) {
            currentSpeed += increment;
            System.out.println("A velocidade é: " + currentSpeed + " Km");
        } else {
            System.out.println("Ligue o motor primeiro...");
        }
    }
}
