package advancedPOO;

public class Engine {
    //Criar um conjunto de atributos e métodos para que possa ser reutilizado em outros objetos

    private String typeEngine;
    private int power;


    public Engine(String typeEngine, int power ) {
        this.typeEngine = typeEngine;
        this.power = power;
    }

    public void showEngine() {
        System.out.println("O tipo do motor é: " + this.typeEngine + "com potêncioa de " + this.power + "cavalos.");
    }

}