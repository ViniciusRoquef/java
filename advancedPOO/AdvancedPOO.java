package advancedPOO;

public class AdvancedPOO {
    
    public static void main(String[] args) {

        //1 - Object composition
        Engine engine1 = new Engine("V8", 500);

        Car car1 = new Car("Azul", "Ford", engine1);

        car1.showInfo();
    }
}
