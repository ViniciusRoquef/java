package advancedPOO;

public class Car {
    
    private String color;
    private String mark;
    private Engine engine;

    public Car(String color, String mark, Engine engine) {
        this.color = color; 
        this.mark = mark; 

        //Object composition
        this.engine = engine;
    }

    public void showInfo() {
        System.out.println("A marca do carro é: " + this.mark + " de cor " + this.color);
        this.engine.showEngine();
    }
}
