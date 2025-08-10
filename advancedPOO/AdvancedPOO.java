package advancedPOO;

public class AdvancedPOO {
    
    public static void main(String[] args) {

        //1 - Object composition
        Engine engine1 = new Engine("V8", 500);

        Car car1 = new Car("Azul", "Ford", engine1);

        car1.showInfo();

        //2 - Herança
        Dog cachorro1 = new Dog("Luke", "Caramelow");
        cachorro1.Latir();
        cachorro1.makeSound();

        //3 - Classe object
        //? usada intrinsecamente no java, já que todas as classes herdam os métodos da classe Object. ex: .equels(), .toString()...

        Person vinicius = new Person("Vinicius", 23);
        Person pedro = new Person("Pedro", 24);

        System.out.println(vinicius.equals(pedro));
        System.out.println(pedro.toString());
    }
}
